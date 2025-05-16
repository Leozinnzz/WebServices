# 🗄️ Projeto CRUD com Java, JPA e Hibernate

## 📄 Descrição

Este projeto é uma aplicação Java que utiliza **JPA (Java Persistence API)** com **Hibernate** como provedor para realizar operações CRUD em um banco de dados SQL. O objetivo é demonstrar o mapeamento objeto-relacional (ORM), facilitando a persistência de dados entre o programa Java e o banco de dados relacional de forma eficiente e organizada.

---

## 🚀 Tecnologias Utilizadas

- **Java 17**  
- **JPA (Java Persistence API)**  
- **Hibernate ORM**  
- **Banco de Dados SQL** (MySQL, PostgreSQL, ou outro)  
- **Maven** (ou Gradle)  
- **IDE**: IntelliJ IDEA / Eclipse / STS  

## 🧩 Funcionalidades

- Criar registros no banco de dados  
- Consultar dados com queries simples  
- Atualizar registros existentes  
- Remover registros  
- Mapeamento das entidades Java para tabelas SQL  

## 🏗️ Estrutura do Projeto

- `model` – Classes de entidade com anotações JPA  
- `repository` – Repositórios para operações de banco de dados  
- `service` – Camada de negócio para regras e validações  
- `main` – Ponto de entrada para executar operações  

## 📦 Como Executar

1. Configure a conexão com seu banco SQL no arquivo `persistence.xml` ou `application.properties`.  
2. Clone este repositório:  
   ```bash
   git clone https://github.com/SeuUsuario/nome-do-repo.git
