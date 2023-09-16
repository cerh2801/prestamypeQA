#language: es
@confiming
Característica: Validar robot y sitemap

  Escenario: Probar Robot y sitemap.xml
    Dado que he ingresado al navegador web
    Cuando validar si tiene acceso a link robot.txt
    Entonces tomar srcreenshot "<path>"
    Y validar si tiene acceso a sitemap.xml
    * take a screenshot "<paths>"
    * cerrar navegador