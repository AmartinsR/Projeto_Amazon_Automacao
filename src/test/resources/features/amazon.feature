#Author: amandamartinssantos0@gmail.com

@test
Feature: Realizar compra 
  I como usuario quero acessar o site claro para realizar uma compra
  
  Scenario: Realizar compra
    Given digite o produto que desejo 
    When clico na lupa para pesquisar 
    And clico no produto desejado
    Then clico em comprar 
    And clico no carrinho de compras e em finalizar compra
    And preecho os dados e forma de pagamento
   

 