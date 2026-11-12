
package com.sofka.qa;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SerenityJUnit5Extension.class)
public class SauceDemoTest {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void completarCompraEnSauceDemo() {

        WebDriverWait wait = new WebDriverWait(
                driver, Duration.ofSeconds(15));

        // 1. Ingresar a SauceDemo
        driver.get("https://www.saucedemo.com/");

        // 2. Autenticarse con las credenciales del ejercicio
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("user-name"))).sendKeys("standard_user");

        driver.findElement(By.id("password"))
                .sendKeys("secret_sauce");

        driver.findElement(By.id("login-button")).click();

        // Verificar que se ingresó al catálogo de productos
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("inventory_list")));

        // 3. Agregar dos productos al carrito
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-backpack"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("add-to-cart-sauce-labs-bike-light"))).click();

        // 4. Visualizar el carrito
        driver.findElement(
                By.className("shopping_cart_link")).click();

        // Verificar que el carrito contiene exactamente dos productos
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("cart_list")));

        List<WebElement> productos = driver.findElements(
                By.className("cart_item"));

        assertEquals(2, productos.size(),
                "El carrito debe contener exactamente dos productos.");

        // Verificar los nombres de los productos agregados
        assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));
        assertTrue(driver.getPageSource().contains("Sauce Labs Bike Light"));

        // 5. Iniciar el proceso de compra
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("checkout"))).click();

        // 6. Completar el formulario de compra
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("first-name"))).sendKeys("Usuario");

        driver.findElement(By.id("last-name"))
                .sendKeys("Prueba");

        driver.findElement(By.id("postal-code"))
                .sendKeys("110111");

        driver.findElement(By.id("continue")).click();

        // Verificar que se llegó al resumen de compra
        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.className("summary_info")));

        // Verificar que el resumen conserva los dos productos
        List<WebElement> productosResumen = driver.findElements(
                By.className("cart_item"));

        assertEquals(2, productosResumen.size(),
                "El resumen debe mostrar los dos productos.");

        // 7. Finalizar la compra
        wait.until(ExpectedConditions.elementToBeClickable(
                By.id("finish"))).click();

        // 8. Validar la confirmación de compra
        String mensaje = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.className("complete-header")))
                .getText();

        assertEquals("Thank you for your order!", mensaje,
                "No se mostró la confirmación esperada de compra.");
    }
}

