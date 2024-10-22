#language: en

Feature: Make a Purchase

  @Compra

  Scenario Outline: Add products to the cart

    Given the user is on the Swags Labs page '<url>'
    When he enters his credentials correctly '<userName>' '<pass>'
    When he adds three products to the cart
    And removes one product
    And completes the purchase '<firstName>' '<lastName>' '<postalCode>'
    Then he sees the message Thank you for your order

    Examples:
      | url                        | userName      | pass         | firstName | lastName | postalCode |
      ##@externaldata@Data/dataSwagLabs.xlsx@Products
   |https://www.saucedemo.com/   |visual_user   |secret_sauce   |Lorena   |Marin   |111441|
   |https://www.saucedemo.com/   |performance_glitch_user   |secret_sauce   |Adriana   |Sosa   |565656|
   |https://www.saucedemo.com/   |standard_user   |secret_sauce   |Luz Marina   |García   |9999999|
