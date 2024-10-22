#language: en

Feature: User Login

  @Login

  Scenario Outline: Successful login

    Given the user is on the Swags Labs page '<url>'
    When he enters his credentials correctly '<userName>' '<pass>'
    Then he sees the products of the cart

    Examples:
      | url                        | userName      | pass         |
      ##@externaldata@Data/dataSwagLabs.xlsx@LoginUsuario
   |https://www.saucedemo.com/   |standard_user   |secret_sauce|
   |https://www.saucedemo.com/   |visual_user   |secret_sauce|
  
