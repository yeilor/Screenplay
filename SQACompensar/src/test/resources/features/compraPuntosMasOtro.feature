#language: es

Característica: Compra con Puntos + Otro medio de pago

  @CompraPuntosMasOtro

  Esquema del escenario:  Compra con Puntos + Otro

    Dado  que el usuario se encuentre en pagina web de Bienestar "<url>"
    Cuando seleccione el tipo de documento e ingrese el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Cuando el usuario selecciona una experiencia para comprar '<nombreExperiencia>' '<cantidad>'
    Y selecciona un medio de pago realizando el proceso completo de la compra '<Puntos>' '<Banco>' '<TipoPersona>' '<Nombre>' '<Celular>' '<Direccion>' '<TipoIdentificacion>' '<NoDocumento>' '<Correo>'
    Entonces el usuario visualizara un mensaje de felicitaciones por la compra realizada
    Ejemplos:
      | url | usuario | clave | nombreExperiencia | tipoDocumento | cantidad | Puntos | Banco | TipoPersona | Nombre | Celular | Direccion | TipoIdentificacion | NoDocumento | Correo |
##@externaldata@Data/DatosCompensar.xlsx@PuntosMasOtro
   |https://www.preaws.compensar.co/auth/pre-login   |53021207   |Ab123456   |Crea accesorios para ti, tu familia o amigos hechos en cuero   |Cédula de Ciudadanía   |1   |1   |BANCO UNION COLOMBIANO   |Persona Natural   |Pruebas   |3201234567   |Cra 56 a   |Cédula de Ciudadanía   |1101018444   |pruebas@gmail.com|


