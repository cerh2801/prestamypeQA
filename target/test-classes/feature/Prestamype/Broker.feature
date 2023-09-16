#language: es
@broker
Característica: Conviertete en broker

  Esquema del escenario: Registro Broker
    Dado que he ingresado al navegador registro de broker
    Cuando hago clic en conviertete en broker
    Y tomar screen
    * ingresar name "<name>"
    * ingresar lastname "<lastname>"
    * ingresar dni "<dni>"
    * ingresar phone "<phone>"
    * ingresar correo "<mail>"
    * acepto terminos broker
    * boton enviar broker

    Ejemplos:
      | name  | lastname      | dni      | phone     | mail              |
      | Elisa | Rojas Aguirre | 50207340 | 976444553 | rojas@yopmail.com |

    ##el broker se puede registrar n veces, al registrarse n veces se registra directamente en el admin