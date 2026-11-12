INSTRUCCIONES DE EJECUCIÓN – PROYECTO SERENITY BDD

1. DESCRIPCIÓN

Este proyecto contiene una prueba automatizada End-to-End (E2E) sobre SauceDemo, desarrollada con Java, Serenity BDD, Selenium WebDriver y JUnit 5.

La prueba valida el flujo de compra de dos productos, desde el inicio de sesión hasta la confirmación de la orden.

2. REQUISITOS PREVIOS

Antes de ejecutar el proyecto, se debe contar con:

- Java JDK 17 o superior.
- Apache Maven.
- Google Chrome.
- Conexión a internet.
- Acceso al repositorio del proyecto.

El proyecto fue ejecutado y validado en el siguiente entorno:

- Sistema operativo: Windows 11.
- Java: Eclipse Temurin 25.0.5.
- Maven: 3.10.0.
- Navegador: Google Chrome.

3. DESCARGA DEL PROYECTO

Clonar el repositorio desde GitHub:

git clone https://github.com/nfricovela/ejercicio-serenity.git

Ingresar al directorio del proyecto:

cd ejercicio-serenity

4. EJECUCIÓN DE LAS PRUEBAS

Desde la terminal, ubicada en la carpeta raíz del proyecto, ejecutar:

mvn clean test

Este comando limpia los resultados anteriores, compila el proyecto y ejecuta las pruebas automatizadas.

5. GENERACIÓN DEL REPORTE

Una vez finalizada la ejecución, generar el reporte de Serenity con:

mvn serenity:aggregate

6. CONSULTA DE EVIDENCIAS

El reporte HTML se encuentra en:

evidencias/index.html

Abrir este archivo en un navegador para consultar:

- Resultados generales.
- Porcentaje de pruebas aprobadas.
- Cobertura funcional.
- Estadísticas de ejecución.
- Detalles de las pruebas.

La carpeta evidencias debe conservar sus archivos y subcarpetas de recursos para que el reporte HTML pueda visualizarse correctamente.

7. RESULTADOS DE LA ÚLTIMA EJECUCIÓN

Pruebas ejecutadas: 1
Pruebas aprobadas: 1
Pruebas fallidas: 0
Errores: 0
Porcentaje de aprobación: 100 %
Duración reportada: 2 minutos y 4 segundos.

8. ESCENARIO VALIDADO

El escenario automatizado contempla:

- Inicio de sesión.
- Acceso al catálogo.
- Selección de dos productos.
- Validación del carrito.
- Inicio del proceso de compra.
- Diligenciamiento del formulario.
- Validación del resumen.
- Finalización de la compra.
- Verificación del mensaje de confirmación.

9. REPOSITORIO

https://github.com/nfricovela/ejercicio-serenity.git

FIN DEL DOCUMENTO.