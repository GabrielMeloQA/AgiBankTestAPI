# AgiBankTestAPI

Projeto de testes automatizados de API utilizando Java.

## Descrição

Este repositório contém uma suíte de testes automatizados para APIs utilizando as seguintes tecnologias:

- **Java**: linguagem principal do projeto.
- **RestAssured**: para automação de testes de APIs REST.
- **Cucumber**: para escrita dos testes em formato BDD (Behavior-Driven Development).
- **Allure Reports**: para geração de relatórios ricos e visuais dos testes executados.

## Objetivo

Automatizar cenários de teste para validação de APIs, proporcionando maior segurança, confiabilidade e documentação do comportamento das integrações testadas através de relatórios detalhados.

## Estrutura do Projeto

```
src/
├── main/
└── test/
    ├── java/
    │   └── ... (step definitions, testes)
    └── resources/
        └── ... (features do Cucumber)
```

## Como executar

1. **Pré-requisitos**
   - Java 8 ou superior instalado
   - Maven ou Gradle instalado

2. **Clonar o projeto**
   ```
   git clone https://github.com/GabrielMeloQA/AgiBankTestAPI.git
   cd AgiBankTestAPI
   ```

3. **Executar os testes**
   - Com Maven:
     ```
     mvn clean test
     ```
   - Com Gradle:
     ```
     gradle clean test
     ```

4. **Gerar relatório Allure**
   - Após a execução dos testes:
     ```
     allure serve target/allure-results
     ```

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou pull requests com sugestões de melhorias, correções de bugs ou novos cenários de teste.

## Licença

Este projeto ainda não possui uma licença definida.

## Autor

- [Gabriel Melo](https://github.com/GabrielMeloQA)
