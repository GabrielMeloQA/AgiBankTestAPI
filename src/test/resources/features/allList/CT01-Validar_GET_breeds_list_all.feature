Feature: Validar GET - list all breeds status code

  Scenario: Validação positiva do endpoint List all breeds
    Given que eu quero validar a requisição GET - List all breeds
    When enviar a requisição All List
    Then statuscode deverá ser 200