Nombre del proyecto: Products_Store
Descripcion: Este Script abastece las nesecidades del cliente, realizando una prueba automatizada (E2E) donde se simula
la compra de un producto en la pagina https://www.demoblaze.com/index.html

Requisitos del sistema:
JDK: Version 17
Maven: Version 3.9.9
Google Chrome: Actualizado a la ultima version.

Instrucciones:
- ajustar los parametros (Datos de prueba) a gusto del usuario en el file "login.feature" en la siguiente dirección: (SE PUEDE OMITIR ESTE PASO)
    Producs_Store/src/test/resources/login.feature
    Aqui podras ajustar los siguientes campos:
    Name
    Country
    City
    Credit
    Month
    Year

- Una vez ajustados los parametros a gusto (NO ES OBLIGATORIO) ejecutar la clase "RunnerComprarProducto" que se encuentra en la siguiente ruta del proyecto:
    Products_Store/src/test/java/Runner/RunnerComprarProducto
    Esta clase ejecutara el Script

- Una vez ejecutado el Script visualizar el reporte generado:
    Ingresar a la carpeta (File Explore) donde se descargo el repositorio de GitHub
    En la parte superior en el campo buscador directorio ingresar la palabra "cmd" y oprimir la tecla "Enter".
    se abre el cmd y escribir "mvn clean verify test" y oprimir la tecla "Enter"
    Se debe regresar al "File Explore" e ingresar a la carpeta donde se descargo el proyecto de GitHub y buscar el archivo index en la siguiente ubicacion
    Products_Store\target\site\serenity\index

    Se podrá ver correctamente el reporte de la prueba
