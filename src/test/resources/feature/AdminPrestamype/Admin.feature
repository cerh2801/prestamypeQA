#language: es
@InversionistaAprobado
Característica: Aprobacion de inversionista

  @ModuloCMS
  Esquema del escenario: yo como admin ingreso al modulo CMS
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo CMS

    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |

  @Moduloinversionista
  Esquema del escenario: yo como inversionista requiero aprobacion
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo inversionista
    * al modulo inversionista listado
    * realizar la busqueda correspondiente "<ename>"
    * aprobar inversionista

    Ejemplos:
      | usuadmin                      | adminpassword    | ename                                     |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i | marcelosullcaray0399kgmailcom@yopmail.com |

  @ModuloInversionenprestamos
  Esquema del escenario: yo como admin ingreso al modulo inversion de prestamos
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo inversionista
    * al modulo inversionista listado

    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |

  @ModuloInversionperfilinstitucional
  Esquema del escenario: yo como admin ingreso al modulo inversion perfil institucional
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo inversionista
    * ir al modulo perfil institucional

    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |

  @ModuloInversiondePrestamo
  Esquema del escenario: yo como admin ingreso al modulo inversion de prestamo
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo Inversion en prestamo
    * creacion de perfil en prestamo
    * registro de creacion de perfil
    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |


  @ModuloInversiondeprestamoGestiondecolocaciones
  Esquema del escenario: yo como admin ingreso al modulo gestion de colocaciones
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo Inversion en prestamo
    * click gestion de colocaciones
    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |

  @ModuloConfiguracion
  Esquema del escenario: yo como admin ingreso al modulo configuracion
    Dado que he ingresado al browser admin
    Cuando usuario ingresa a inversionista "<usuadmin>" "<adminpassword>"
    Entonces realizar click en comenzar
    Y al modulo configuracion
    * realizar click sucursales
    * crear sucursal

    Ejemplos:
      | usuadmin                      | adminpassword    |
      | infoprestamypecom@yopmail.com | $YzZKG#Kmj1E*14i |