#language: es
@confiming
Característica: subasta confirming

  Esquema del escenario: Registro facturas subasta confirming soles
    Dado que he ingresado al navegador confirming
    Cuando hago clic en el enlace de inicio de sesión confirming
    Y ingreso el correo electrónico "<email>" confirming
    * ingreso la contraseña "<pass>" confirming
    * hago clic en el botón de inicio de sesión confirming
    * Dirigirte al modulo confirming
    * seleccionar tipo relacion empresa confirming
    * select tipo de empresa  "<rucc>" confirming
    * ingresar razon social  "<rrz>" confirming
    * ingresar telefono  "<phone>" confirming
    * acepto terminos confirming
    * guardar confirming



    Ejemplos:
      | email                          | pass             | rucc        | rrz               | phone      | pruc        | praz        | pphone    | proname | pmail             | prophone | mt   |
      | jsotooliverahotmailcom@yopmail.com | *9gGcn7103TrmHW0 | 20502073405 | ECOCENTURY S.A.C. | 9847573857 | 20127765279 | COESTI S.A. | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
     # | tstmasivoce02@yopmail.com  | 781783cerhC | 20132515680 | INDUSTRIAL COMERCIAL HOLGUIN E HIJOS S.A. | 9847573857 | 20452783011 | AGRICOLA LAS PALMERAS E.I.R.L. | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
      #|testprbtest40@yopmail.com| 781783cerhC | 20875038384 | AQA QUIMICA SA                              | 9847573857 | 20954073143 | LA POSITIVA VIDA SEGUROS Y REASEGUROS              | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
     #| tstmasivoce02@yopmail.com   | 781783cerhC | 20502073401 | ECOCENTURY S.A.C.                           | 9847573857 | 20127765279 | COESTI S.A.                                        | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
     # | tstmasivoce02@yopmail.com  | 781783cerhC | 20278966004 | PESQUERA CENTINELA SOCIEDAD ANONIMA CERRADA | 9847573857 | 20534090677 | SERVICIOS GENERALES PIPOS SOCIEDAD ANONIMA CERRADA | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
     # | tstmaxtest305@yopmail.com | 781783cerhC | 20278966004 | PESQUERA CENTINELA SOCIEDAD ANONIMA CERRADA | 9847573857 | 20534090677 | SERVICIOS GENERALES PIPOS SOCIEDAD ANONIMA CERRADA | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |
     # | tstmaxtest305@yopmail.com | 781783cerhC | 20100136741 | MINSUR S.A | 9847573857 | 20602556361 | CONSTRUCTORA TRANCEDI S.A.C. | 654536543 | Luis E. | Luise@yopmail.com | 8477577  | 2550 |