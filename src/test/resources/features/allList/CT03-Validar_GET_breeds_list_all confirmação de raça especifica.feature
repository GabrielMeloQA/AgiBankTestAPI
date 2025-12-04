Feature: Validar GET - list all breeds raça por pais

 Scenario Outline: Validação de raça por pais
    Given que eu quero validar raça por pais da requisição GET - List all breeds
    When enviar a requisição All List
    Then validar se há raça "<raca>" no pais "<pais>"
   Examples:
     | raca      | pais      |
     | bakharwal | indian    |
     | bouvier   | norwegian |