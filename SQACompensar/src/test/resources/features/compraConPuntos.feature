#language: es

Característica: Compra de una Experiencia

  @Compra

  Esquema del escenario:  Compra de experiencia por puntos exitosa

    Dado  que el usuario se encuentre en pagina web de Bienestar "<url>"
    Cuando seleccione el tipo de documento e ingrese el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Cuando el usuario selecciona una experiencia para comprar '<nombreExperiencia>' '<cantidad>'
    Y realiza el proceso completo de la compra
    Entonces el usuario visualizara un mensaje de felicitaciones por la compra
    Ejemplos:
      | url                                            | usuario    | clave         | nombreExperiencia | tipoDocumento        | cantidad |
##@externaldata@Data/DatosCompensar.xlsx@Experiencia
   |https://www.preaws.compensar.co/auth/pre-login   |53021207   |Ab123456   |Crea accesorios para ti, tu familia o amigos hechos en cuero   |Cédula de Ciudadanía   |1|

