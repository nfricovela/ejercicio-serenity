# Pruebas Automatizadas E2E con Serenity BDD – SauceDemo

## Descripción del proyecto

Este proyecto implementa una prueba automatizada End-to-End (E2E) sobre la aplicación web [SauceDemo](https://www.saucedemo.com/), utilizando **Serenity BDD, Selenium WebDriver y JUnit 5**.

El objetivo es validar el flujo principal de compra de la aplicación, desde el inicio de sesión hasta la confirmación de la orden.

## Tecnologías utilizadas

- Java 25.0.5 (Eclipse Temurin).
- Maven 3.10.0.
- Serenity BDD 4.2.34.
- Selenium WebDriver.
- JUnit 5.11.4.
- Google Chrome.
- Visual Studio Code.

## Escenario automatizado

Se implementó el siguiente flujo:

1. Ingresar a SauceDemo.
2. Iniciar sesión con el usuario `standard_user`.
3. Verificar el acceso al catálogo de productos.
4. Agregar dos productos al carrito:
   - Sauce Labs Backpack.
   - Sauce Labs Bike Light.
5. Ingresar al carrito y verificar que contiene exactamente dos productos.
6. Iniciar el proceso de compra.
7. Completar el formulario con nombre, apellido y código postal.
8. Verificar que los dos productos aparecen en el resumen de compra.
9. Finalizar la compra.
10. Validar el mensaje de confirmación: `Thank you for your order!`.

## Estructura del proyecto

```text
ejercicio-serenity/
│
├── evidencias/
│   └── index.html
│
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/sofka/qa/
│   │           └── App.java
│   │
│   └── test/
│       └── java/
│           └── com/sofka/qa/
│               └── SauceDemoTest.java
│
├── .gitignore
├── pom.xml
├── README.md
├── readme.txt
└── conclusiones.txt
```

La carpeta `evidencias` contiene el reporte HTML generado por Serenity y sus recursos asociados.

## Ejecución del proyecto

Clonar el repositorio:

```bash
git clone https://github.com/nfricovela/ejercicio-serenity.git
```

Ingresar a la carpeta:

```bash
cd ejercicio-serenity
```

Ejecutar las pruebas automatizadas:

```bash
mvn clean test
```

Generar el reporte de Serenity:

```bash
mvn serenity:aggregate
```

## Resultados de ejecución

La ejecución final del escenario automatizado presentó los siguientes resultados:

| Indicador | Resultado |
|---|---:|
| Pruebas ejecutadas | 1 |
| Pruebas aprobadas | 1 |
| Pruebas fallidas | 0 |
| Errores | 0 |
| Porcentaje de aprobación | 100 %