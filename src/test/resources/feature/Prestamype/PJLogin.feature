#language: es

@P2P-183
Característica: Funcionalidad de persona juridica

  @ingresoaperfilinstitucional
  Esquema del escenario: ingreso al perfil istitucional sucessful
    Dado que he ingresado al navegador
    Cuando hago clic en el enlace de inicio de sesión
    Y ingreso el correo electrónico "<email>"
    Y ingreso la contraseña "<pass>"
    * hago clic en el botón de inicio de sesión
    * ingresar a menu
    * ingresar a perfil institucional
    Ejemplos:
      | email                          | pass             |
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 |