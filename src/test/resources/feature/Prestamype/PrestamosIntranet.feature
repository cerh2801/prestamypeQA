 #language: es

 @Solicitudprestamointranet
 Característica: Registro una solicitud de prestamo de un
  inmueble

  @Solicitudprestamointranet
  Esquema del escenario: solicitud registro de prestamo en el intranet
   Dado ingresado al navegador
   Cuando hago clic en el enlace de inicio de sesion
   Y ingreso  correo electrónico "<email>"
   * ingreso  contraseña "<pass>"
   * hago clic en botón de inicio de sesión
   * seleccionar tab empresario
    # paso2 - request
   * ir a modulo prestamo
   * seleccionar motive
   * select inversion
   * tiene una propiedad


  Ejemplos:
   | email                          | pass             |
   | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 |