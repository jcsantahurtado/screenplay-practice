# screenplay-practice
General Practical Test with Screenplay

## Run del proyecto

Antes de ejecutar el proyecto hay que verificar la versión de Chrome, (la usada en este proyecto fue la versión 107), por lo que quizás sea necesario reemplazar el Driver, el cual queda en la siguiente ruta:

```
src/test/resources/com.sophos.academy.drivers/linux/chromedriver
```
O en esta otra ruta si su sistema operativo es Windows:
```
src/test/resources/com.sophos.academy.drivers/windows/chromedriver.exe
```


## Construido con

_Algunas de las herramientas que utilizadas para crear el proyecto_

* [Gradle](https://docs.gradle.org/current/userguide/userguide.html) - Usado para declarar la configuración de proyecto. 
* [Screenplay](https://serenity-js.org/handbook/design/screenplay-pattern.html) - El patrón Screenplay que su enfoque central está en el usuario para escribir pruebas de aceptación automatizadas de alta calidad.
* [Serenity BDD](https://serenity-bdd.info/) - Como ayuda para escribir pruebas de aceptación y regresión automatizadas más limpias y fáciles de mantener más rápido, además usado para los serenity reports.
* [Gherkin](https://cucumber.io/docs/gherkin/reference/) - Utilizado para escribir los escenarios de prueba.
* [ChromeDriver v107](https://chromedriver.chromium.org/downloads) - Controlador Web. 
