#language: es

Característica: Login usuario

  @Login
  Esquema del escenario: Login de usuario exitoso
    Dado  que el usuario se encuentre en pagina web de Bienestar "<url>"
    Cuando seleccione el tipo de documento e ingrese el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Entonces visualizara la ventana de experiencias
    Ejemplos:
      | url                                            | usuario    | clave         | tipoDocumento |
##@externaldata@Data/DatosCompensar.xlsx@Login

