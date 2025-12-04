Feature: Validar GET - list all breeds erro 404

  Scenario: Validação de status code
    Given que eu quero validar a requisição GET - List all breeds
    When enviar a requisição All List
    Then status deverá ser "success"