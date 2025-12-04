Feature: Feature: Validar GET - images by breed

  Scenario Outline: Validação positiva do endpoint images by breed
    Given que eu quero validar a requisição GET - images by breed da raça "<raca>"
    When enviar a requisição images by breed
    Then statuscode deverá ser 200
Examples:
  | raca    |
  | terrier |
  | hound   |
  | kelpie  |
  | chihahuahauahauhaua |