Feature: Compra de productos

  @compra

  Scenario Outline: Compra exitosa

    Given Que me encuentro en la pagina de compras de san Angel '<url>'
    When agrego dos productos al carrito con diferentes cantidades '<CantidadProducto>' '<NombreCliente>' '<ApellidoCliente>' '<Documento>' '<TelefonoCliente>' '<CorreoCliente>' '<NombreDestinatario>' '<Municipio>' '<Direccion>' '<InfoAdicional>' '<TelefonoDestinatario>' '<Mensaje>' '<Firma>' '<Horario>' '<Observaciones>' '<fecha>' '<CeluPago>'
    Then Se visualiza el resumen de la compra


    Examples:
      | url                        | CantidadProducto | NombreCliente | ApellidoCliente | Documento | TelefonoCliente | CorreoCliente   | NombreDestinatario | Municipio | Direccion   | InfoAdicional | TelefonoDestinatario | Mensaje  | Firma | Horario              | Observaciones | fecha | CeluPago   |
##@externaldata@data/DatosSanAngel.xlsx@Compras
   |https://sanangel.com.co/#/   |2   |Lorena   |Sosa   |123456   |31256874   |yei@hotmail.com   |Adriana Marin   |Medellín   |Cra 56 - 4   |Casa   |320456789   |Con amor   |YEI   |9:00 a.m. - 1:00 p.m   |Prueba   |10   |3214785965|
   |https://sanangel.com.co/#/   |5   |Carlos   |Alfred   |987654   |3117889652   |car@gmail.com   |Marina Sosa   |Itagüí   |Cll 45 - 78   |Apto   |3568795641   |Cariño   |CAAS   |2:00 p.m. - 7:00 p.m   |Prueba2   |15   |3247896321|


  

