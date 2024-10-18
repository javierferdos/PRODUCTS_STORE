Feature: Realizar una compra del producto agregado al carrito

  Scenario: usuario compra producto del carrito
    Given el usuario navegara en la pagina Products Store
    When el usuario escogera el producto "Iphone 6 32gb"
    Then el usuario lo agregara al carro de compras
    And el usuario ira al carrito para realizar la compra
    When el usuario de click en Place Order llenara el formulario con la siguiente informacion
      | Name            | javier              |
      | Country         | colombia            |
      | City            | bogota              |
      | Credit          | 1150 9658 7411 2587 |
      | card            | 123                 |
      | Month           | 09                  |
      | Year            | 2023                |