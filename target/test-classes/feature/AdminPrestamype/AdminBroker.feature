#language: es
@Broker
Característica: Registrar ingreso datos del broker

  @ModuloBroker
  Esquema del escenario: yo ingreso al admin modulo broker
    Dado que he ingresado admin modulo broker
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>" broker
    Entonces realizar click en comenzar broker
    Y dirigirse a broker
    * realizar click modulo broker
    * ingresar a solicitudes
    * ingresar texto "<mail>"
    * habilitar switch
    * button aceptar
    * enviar url generado por el broker
    * abrir correo yopmail "<mail>"
    * ingresar al urlbroker
    * ingresar dni "<numdoc>"


    #ingreso del inmueble para solicitud de prestamo
    #observacion asi el enlace este desactivado el enlace aun continua funcionando




    Ejemplos:
      | usuadmin                      | adminpassword    | mail               | numdoc   |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i | rojas@yopmail.com | 49032634 |

