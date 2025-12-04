Feature: Feature: Validar GET - images by breed

  Scenario: Validação positiva do endpoint images by breed
    Given que eu quero validar a requisição GET - random images by breed da raça
    When enviar a requisição random images
    Then statuscode deverá ser 200