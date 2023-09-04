 #language: es
 @Solicitudprestamo
 Característica: Registro de inversión en GH Inversionista a través de Prestamype
   Para evitar errores en el registro de inversión
   Como inversor interesado en invertir en GH Inversionista
   Quiero utilizar la automatización para registrar mi inversión correctamente

   @Precalificar
   Esquema del escenario: Definir monto de inversión y precalificar
     Dado ingresado al navegador
     Cuando clic en el enlace Préstamo
     Entonces clic en la opción Definir monto a solicitar
     Y presiono el botón Precalificar
     * ingresar datos a completar "<dni>"
     * ingresar email a completar "<email>"
     * ingresar phone a completar "<phone>"
     * desplazarse acepto terminos
     * ingresar otherphone a completar "<otherphone>"
     * selecciono de la lista desplegable
     * Se seleccionado opcion
     * si tienes propiedad
     * acepto terminos
     * btn siguiente
     * scrool a el inmueble esta inscrito
     * esta inscrito en sunarp
     * scrool el tipo de propiedad
     * tipo de inmueble casa
     * seleccionar departamento
     * selecciono Lima
     * seleccionar provincia
     * seleccionar Lima provincia
     * seleccionar distrito
     * seleccionar magdalena
     * area en metros "<aream>"
     * Mostrar resultados

     Ejemplos:
       | dni      | email                                | phone         | otherphone |aream      |
       | 46234558 | pruebainmobiliaria12test@yopmail.com | 9864636370090 | 6758588588 |  3000     |

   @Dninocalificas
   Esquema del escenario: Dninocalificas
     Dado ingresado al navegador
     Cuando clic en el enlace Préstamo
     Entonces clic en la opción Definir monto a solicitar
     Y presiono el botón Precalificar
     * ingresar datos a completar "<dni>"
     * ingresar email a completar "<email>"
     * ingresar phone a completar "<phone>"
     * desplazarse acepto terminos
     * ingresar otherphone a completar "<otherphone>"
     * selecciono de la lista desplegable
     * Se seleccionado opcion
     * si tienes propiedad
     * acepto terminos
     * btn siguiente
     * scrool a el inmueble esta inscrito
     * esta inscrito en sunarp
     * scrool el tipo de propiedad
     * tipo de inmueble casa
     * seleccionar departamento
     * selecciono Lima
     * seleccionar provincia
     * seleccionar Lima provincia
     * seleccionar distrito
     * seleccionar magdalena
     * area en metros "<aream>"
     * Mostrar resultados

     Ejemplos:
       | dni      | email                                | phone         | otherphone |aream      |
       | 46234558 | pruebainmobiliaria12test@yopmail.com | 9864636370090 | 6758588588 |  3000     |

   @DniCalificas
   Esquema del escenario: DNI calificado
     Dado ingresado al navegador
     Cuando clic en el enlace Préstamo
     Entonces clic en la opción Definir monto a solicitar
     Y presiono el botón Precalificar
     * ingresar datos a completar "<dni>"
     * ingresar email a completar "<email>"
     * ingresar phone a completar "<phone>"
     * desplazarse acepto terminos
     * ingresar otherphone a completar "<otherphone>"
     * selecciono de la lista desplegable
     * Se seleccionado opcion
     * si tienes propiedad
     * acepto terminos
     * btn siguiente
     * scrool a el inmueble esta inscrito
     * esta inscrito en sunarp
     * scrool el tipo de propiedad
     * tipo de inmueble casa
     * seleccionar departamento
     * selecciono Lima
     * seleccionar provincia
     * seleccionar Lima provincia
     * seleccionar distrito
     * seleccionar magdalena
     * area en metros "<aream>"
     * Mostrar resultados

     Ejemplos:
       | dni      | email                                | phone         | otherphone |aream      |
       | 44634566 | pruebainmobiliaria13test@yopmail.com | 9864636370090 | 6758588588 |  3000     |