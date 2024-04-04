# CRUD de Produtos com Spring Boot e Redis

Este é um exemplo simples de uma aplicação Spring Boot que implementa um CRUD (Create, Read, Update, Delete) de produtos utilizando Redis como banco de dados para armazenamento.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 2.6.3
- Redis
- Maven
- IntelliJ IDEA

## Configurações

Certifique-se de ter o Redis instalado e em execução localmente. As configurações do Redis estão especificadas no arquivo `application.properties`.

## Endpoints

A aplicação fornece os seguintes endpoints:

- `POST /products`: Adiciona um novo produto.
- `GET /products/{id}`: Retorna as informações de um produto específico.
- `PUT /products/{id}`: Atualiza as informações de um produto existente.
- `DELETE /products/{id}`: Exclui um produto.

## Como Executar

1. Clone este repositório.
2. Importe o projeto para o IntelliJ IDEA.
3. Certifique-se de que todas as dependências Maven são baixadas.
4. Inicie a aplicação.

## Contribuindo

Sinta-se à vontade para contribuir com melhorias, correções de bugs ou novos recursos. Basta abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [MIT License](LICENSE).
