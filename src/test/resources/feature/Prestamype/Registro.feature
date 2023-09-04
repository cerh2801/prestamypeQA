#language: es

@registro
Característica: Funcionalidad de registro

  @registrodnisuccessfull
  Esquema del escenario: Registro de dni
    Dado que he ingresado al browser
    Cuando realizar click en registro
    Entonces Ingresar el documento "<numdoc>"
    Y Ingresar telefono "<fono>"
    * ingresar mail "<mail>"
    * ingresar pass  "<contra>"
    * ingresar repass "<recontra>"
    * acepta terminos y condiciones
    * click boton registrate
    * ingresar nueva pestaña yopmail
   # * ingresar email "<mail>"

    Ejemplos:
      | numdoc   | fono      | mail                           | contra      | recontra    |
      | 49032634 | 986565908 | testprbtest023test@yopmail.com | 781783cerhC | 781783cerhC |


  @registrocesuccessfull
  Esquema del escenario: Check ce registrado
    Dado que he ingresado al browser
    Cuando realizar click en registro
    Entonces seleccionar el tipo de documento ce
    Y seleccionar ce
    * usuario ingresa el número de documento registrado "<numdoc>"
    Y Ingresar telefono "<fono>"
    * ingresar mail "<mail>"
    * ingresar pass  "<contra>"
    * ingresar repass "<recontra>"
    * acepta terminos y condiciones
    * click boton registrate
    * ingresar nueva pestaña yopmail
    Ejemplos:
      | numdoc    | fono      | mail                   | contra      | recontra    |
      | 000847898 | 986564673 | tstinvce04@yopmail.com | 781783cerhC | 781783cerhC |



