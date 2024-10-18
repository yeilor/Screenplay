#language: es

Característica: Login Administrador

  @LoginAdmin
  Esquema del escenario: Login de usuario administrador exitoso
    Dado  que el usuario se encuentra en la pagina web de Bienestar "<url>"
    Cuando seleccione el tipo de documento ingresando el numero de documento con la clave '<usuario>' '<clave>' '<tipoDocumento>'
    Entonces visualizara la ventana de Administrador de Plataforma
    Ejemplos:
      | url                                              | usuario    | clave         | tipoDocumento        |
##@externaldata@Data/DatosCompensar.xlsx@LoginAdmin
      | https://admin.preaws.compensar.co/auth/pre-login | 1000134386 | Ab1234567890* | Cédula de Ciudadanía |
