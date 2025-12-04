Feature: Validar GET - list all breeds

  Scenario: Validação de status success
    Given que eu quero validar a requisição GET - List all breeds
    When enviar a requisição All List
    Then status deverá ser "success"