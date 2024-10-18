#language: es

Característica: Login usuario

  @LoginUsuario
  Esquema del escenario: Login de usuario exitoso
    Dado  que el usuario se encuentra en pagina web de Bienestar "<url>"
    Cuando seleccione el tipo de documento e ingrese el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Entonces visualizara la ventana de experiencias
    Ejemplos:
      | url                                            | usuario    | clave         | tipoDocumento        |
##@externaldata@Data/DatosCompensar.xlsx@LoginUsuario
   |https://www.preaws.compensar.co/auth/pre-login   |1000134386   |Ab1234567890*   |Cédula de Ciudadanía|

