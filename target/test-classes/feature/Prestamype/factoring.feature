#language: es
@inversionista
Característica: Funcionalidad realizar puja en subasta

  Esquema del escenario: realizar pujas en subastas
    Dado que he ingresado al navegador a invertir
    Cuando hago clic en el enlace de inicio de session
    Y ingreso el email "<email>"
    * ingreso el pass "<pass>"
    * realizar clic en el botón de inicio de sesión
    * ir a oportunidades
    * click en invertir
    * monto a invertir
    * click realizar inversion


    Ejemplos:
      | email                          | pass             |
      | mpocomuchagmailcom@yopmail.com | *9gGcn7103TrmHW0 |


  @Empresario

  Esquema del escenario: subir facturas en factoring
    Dado que he ingresado al navegador a invertir
    Cuando hago clic en el enlace de inicio de session
    Y ingreso el email "<email>"
    * ingreso el pass "<pass>"
    * realizar clic en el botón de inicio de sesión
    * ir a oportunidades
    * ingresar empresa "<ruc>" "<rz>" "<phone>"
    * ingresar cliente "<rucli>" "<rzcli>" "<phonecli>" "<name>" "<emailcli>" "<phonecontact>"
    * realizar click en continuar
    Ejemplos:
      | email                                | pass             | ruc         | rz        | phone      | rucli     | rzcli   | phonecli    | name | emailcli               | phonecontact |
      | cesarmatosingahotmailcom@yopmail.com | *9gGcn7103TrmHW0 | 10837737747 | Elena s.a | 9857756409 | 209838722 | Dos s.a | 90868868686 | Ana  | anamorales@yopmail.com | 98745898743  |
