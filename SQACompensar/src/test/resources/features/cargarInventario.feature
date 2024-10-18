#language: es

Característica: Realizar cargue de inventario

  @Inventario

  Esquema del escenario:  Cargar inventario

    Dado  que el usuario se encuentra en la pagina web de Bienestar "<urL>"
    Cuando seleccione el tipo de documento ingresando el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Cuando realiza un cargue de inventario '<buscar>'
    Entonces visualizara un mensaje de Carga Exitosa
    Ejemplos:
      | urL                                              | usuario    | clave         | tipoDocumento        | buscar         |
    ##@externaldata@Data/DatosCompensar.xlsx@Inventario
      | https://admin.preaws.compensar.co/auth/pre-login | 1000134386 | Ab1234567890* | Cédula de Ciudadanía | Crepes&Waffles |
