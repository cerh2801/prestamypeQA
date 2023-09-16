#language: es

@Deposito
Característica: Depositos de persona natural

  @DepositopersonaNatural
  Esquema del escenario: Deposito Persona Natural empresario
    Dado que he ingresado al navegador persona natural
    Cuando hago clic en el enlace de inicio de sesión persona natural
    Y ingreso el correo electrónico "<email>" persona natural
    * ingreso la contraseña "<pass>" persona natural
    * hago clic en el botón de inicio de sesión persona natural
    * ingresar al modulo estado de cuenta
    * click en deposito
    * realizar deposito
    * ingresar noperacion "<nnumero>"
    * ingresar monto "<nmonto>"
    * activar firmar declaracion
    * subir voucher deposito
    #conocer el numero maximo de numeros de cuenta en prestamype
    # al agregar un nueva transferencia indicar el numero de transferncia adicionales que se solicitan
    Ejemplos:

      | email                          | pass             | nnumero  | nmonto   |
      #empresario|
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 | mjhukiol | 50000000 |