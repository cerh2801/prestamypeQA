#language: es
@InversionistasPublic
Característica: inversionista en public

  Esquema del escenario: Registro facturas subasta inversionista public
    Dado que he ingresado al navegador inversionista public
    Cuando hago clic en el enlace de inicio de sesión inversionista public
    Y ingreso el correo electrónico "<email>" inversionista public
    * ingreso la contraseña "<pass>" inversionista public
    * hago clic en el botón de inicio de sesión inversionista public
    * ingresar al modulo inversionista
    * buscar el codigo de subasta "<subasta>"
    * ir a mis pagos

    Ejemplos:
      | email                          | pass             | subasta  |
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 | 0Yp034ds |

  Esquema del escenario: Filtros de estado de cuenta
    Dado que he ingresado al navegador inversionista public
    Cuando hago clic en el enlace de inicio de sesión inversionista public
    Y ingreso el correo electrónico "<email>" inversionista public
    * ingreso la contraseña "<pass>" inversionista public
    * hago clic en el botón de inicio de sesión inversionista public
    * ingresar al modulo estado de cuenta filtro
    * Seleccionar movimientos "<movimientos>"
    * validar tooltip
    * validar mensaje de tooltip "<msj>"
    * Dirigir a tab dolares


    Ejemplos:
      | email                          | pass             | movimientos |msj|
     # | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 | deposito    ||
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 | todos       |   |