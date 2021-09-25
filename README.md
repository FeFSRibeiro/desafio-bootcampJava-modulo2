# Desafio Módulo 2 - Bootcamp Java Alura
## Projeto: Api Livraria Online

**Requisitos mínimos**

O projeto deve ser uma API Rest utilizando o Spring Boot, criada pelo site Spring Initializr.

O projeto deve utilizar também as bibliotecas Lombok, ModelMapper e Bean Validation, conforme foi demonstrado durante as aulas.

A API deve ter as funcionalidades para cadastro e listagem de autores, conforme havia sido feito no módulo anterior, porém dessa vez sendo no modelo de API, consumindo e devolvendo as informações no formato JSON.

**Nova funcionalidade**

Além da funcionalidade de cadastro e listagem de autores, você também deverá implementar uma nova funcionalidade de cadastro e listagem de livros.

Um livro deve possuir as seguintes informações: título, data de lançamento, número de páginas e autor.

Ao cadastrar um novo livro, as seguintes regras deverão ser validadas:

Título deve ser obrigatório e ter no mínimo 10 caracteres;

Data de lançamento deve ser uma data menor ou igual a data atual;

O número de páginas deve ser maior ou igual a 100.

**Testes com Postman**

Utilize a ferramenta Postman para realizar os testes das funcionalidades da API, conforme demonstramos durante as aulas.

