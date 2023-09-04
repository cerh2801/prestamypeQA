#language: es

@P2P-183
Característica: Funcionalidad de login

  @P2P-179
  Esquema del escenario: Login Successful prestamype
    Dado que he ingresado al navegador
    Cuando hago clic en el enlace de inicio de sesión
    Y ingreso el correo electrónico "<email>"
    * ingreso la contraseña "<pass>"
    * hago clic en el botón de inicio de sesión
    Entonces se espera que el usuario inicie sesión con éxito

    Ejemplos:
      | email                          | pass             |
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 |
#      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 |
#      | testprbtest40@yopmail.com      | 781783cerhC      |
#      | test02cambiocorreo@yopmail.com | 781783cerhC      |
#      | cerh2802@gmail.com             | 781783cerhC      |


  @P2P-102
  Esquema del escenario: Email Incorrecto prestamype
    Dado que he ingresado al navegador
    Cuando hago clic en el enlace de inicio de sesión
    Y ingreso el correo electrónico incorrecto "<email>"
    * ingreso la contraseña "<pass>"
    * hago clic en el botón de inicio de sesión
    Entonces El mensaje de alerta es el siguiente

    Ejemplos:
      | email                          | pass             |
      | mpocomuchagmailcomyopmail.com | *9gGcn7103TrmHW0 |


  @passwordincorrecto
  Esquema del escenario: password incorrecto
    Dado que he ingresado al navegador
    Cuando hago clic en el enlace de inicio de sesión
    Y ingreso el correo electrónico incorrecto "<email>"
    * ingreso la contraseña "<pass>" incorrecta
    * hago clic en el botón de inicio de sesión
    Entonces El mensaje de alerta


    Ejemplos:
      | email                            | pass             |
      | mpocomuchagmailcom02@yopmail.com | *9gGcn7103TmW0   |


  @recupararpassword
  Esquema del escenario: recuperar password
    Dado que he ingresado al navegador
    Cuando hago clic en el enlace de inicio de sesión
    Y realizar click recuperar password
    * desplazarse hacia correo electronico
#    * ingresar mail "<email>"

    Ejemplos:
      | email                            | pass             |
      | mpocomuchagmailcom02@yopmail.com | *9gGcn7103TmW0   |








