# 📦 Product and Consumer System

Backend de e-commerce / marketplace desenvolvido em Java 21 e Spring Boot 4, projetado para simular cenários reais de mercado, com foco em arquitetura limpa, escalabilidade e boas práticas.

O projeto foi construído com preocupações reais de mercado, como deploy em cloud, configuração por variáveis de ambiente, tratamento global de erros e documentação da API.

## 🧠 Principais Destaques Técnicos

- Arquitetura em camadas bem definida (Controller → Service → Repository)
- Modelagem de domínio com relacionamentos complexos (OneToMany, ManyToMany e chave composta), seguindo boas práticas de JPA
- Tratamento centralizado de exceções com @ControllerAdvice
- Separação de ambientes (dev e prod)
- Deploy completo em cloud com banco remoto
- API REST documentada com Swagger / OpenAPI
- Código organizado, legível e escalável

## 🚀 Tecnologias

- Java 21
- Spring Boot 4
- Spring Data JPA / Hibernate
- PostgreSQL (produção)
- H2 Database (desenvolvimento/testes)
- Swagger / OpenAPI (SpringDoc)
- Maven

## ☁️ Deploy e Configuração

O projeto está deployado no Railway, com:

- Backend Spring Boot em produção
- Banco PostgreSQL gerenciado na cloud
- Configuração via variáveis de ambiente
- Conexão segura entre aplicação e banco
- Acesso remoto ao banco para administração local (pgAdmin / DBeaver)

**Essa estrutura permite fácil troca de ambientes, escalabilidade e aderência a padrões de deploy utilizados em aplicações corporativas.**


## 🖥️ Projeto em Execução (Produção)

Abaixo, evidência do sistema em funcionamento em ambiente real:

- Backend Spring Boot rodando em produção no Railway
- Banco PostgreSQL remoto integrado
- Requisições REST sendo realizadas via Postman
- Logs HTTP confirmando respostas 200 OK


<img width="1910" alt="projeto finalizado" src="https://github.com/user-attachments/assets/b4093263-0f1c-4011-a32c-c0006420e927" />


## 🏗️ Arquitetura

```txt
com.victornogueira.productandconsumer
├── config
├── entities
├── repositories
├── resources
├── services
└── exceptions
```

**Entities:** regras e estrutura do domínio

**Repositories:** persistência com JPA

**Services:** regras de negócio

**Resources:** API REST

**Exceptions:** tratamento global de erros

**Config:** ambientes e configurações

## 🔗 Endpoints (Visão Geral)

### Users

- `POST /users`– cria consumidor
- `GET /users` – lista consumidores
- `GET /users/{id}` – busca por ID
- `PUT /users/{id}` – atualiza consumidor
- `DELETE /users/{id}` – remove consumidor

### Products

- `GET /products` – lista produtos com categorias
- `GET /products/{id}` – detalhe do produto


### Categories

- `GET /categories`
- `GET /categories/{id}`

### Orders

- `GET /orders` – lista pedidos com itens, consumidor e valor total calculado
- `GET /orders/{id}` – detalhe completo do pedido

**📌 Todos os endpoints seguem boas práticas REST, com uso correto de HTTP status codes (200, 201, 204, 404).**

## 🧪 Testes

- Testes realizados durante o desenvolvimento
- Uso de banco H2 em memória
- Validação das camadas de serviço e persistência

## 📄 Documentação

A API é documentada automaticamente via Swagger / OpenAPI:
```
/swagger-ui/index.html
```

## 🎯 Objetivo Profissional do Projeto

Este projeto tem como objetivo:

- Demonstrar domínio prático de Spring Boot
- Aplicar arquitetura e organização de código usadas no mercado
- Trabalhar com persistência e relacionamentos reais
- Servir como base para evolução com:
  - Spring Security / JWT
  - Cache
  - Microsserviços
  - Mensageria

## 👤 Autor

Victor Nogueira  
Backend Developer | Java & Spring Boot  
