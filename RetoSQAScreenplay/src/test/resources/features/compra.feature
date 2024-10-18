Feature: Compra de productos

  @compra

  Scenario Outline: Compra exitosa

    Given Que me encuentro en la pagina de compras de san Angel '<url>'
    When agrego dos productos al carrito con diferentes cantidades '<CantidadProducto>' '<NombreCliente>' '<ApellidoCliente>' '<Documento>' '<TelefonoCliente>' '<CorreoCliente>' '<NombreDestinatario>' '<Municipio>' '<Direccion>' '<InfoAdicional>' '<TelefonoDestinatario>' '<Mensaje>' '<Firma>' '<Horario>' '<Observaciones>' '<fecha>' '<CeluPago>'
    Then Se visualiza el resumen de la compra


    Examples:
      | url                        | CantidadProducto | NombreCliente | ApellidoCliente | Documento | TelefonoCliente | CorreoCliente        | NombreDestinatario | Municipio | Direccion  | InfoAdicional | TelefonoDestinatario | Mensaje  | Firma | Horario              | Observaciones | fecha | CeluPago   |
##@externaldata@parametros/DatosSanAngel.xlsx@Compras
      | https://sanangel.com.co/#/ | 2                | Lorena        | Sosa            | 123456    | 31256874        | yei@hotmail.com      | Adriana Marin      | Medellín  | Cra 56 - 4 | Casa          | 320456789            | Con amor | YEI   | 9:00 a.m. - 1:00 p.m | Prueba        | 11    | 3214785965 |
      | https://sanangel.com.co/#/ | 5                | Carlos        | Ariza           | 654321    | 32189754        | carlitos@hotmail.com | Bertilde sosa      | Bello     | Cll 5ta    | Edificio      | 325785212            | Para ti  | CAR   | 2:00 p.m. - 7:00 p.m | Prueba2       | 10    | 3134007885 |

  

