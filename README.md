# 👨🏽‍💻Lps-System-SuperMarketing
Sistema de Supermercado- LPS


 # 🏪Supermarket Management System (Spring Boot)

Este projeto é um sistema completo de gestão de supermercado, desenvolvido com Spring Boot e JPA/Hibernate, seguindo a arquitetura em camadas (Controller, Service, Repository, Entity e DTO).
O objetivo é oferecer uma base sólida para controle de produtos, fornecedores, clientes, estoque, compras, promoções, feedbacks e relatórios.

 # ⚙️Funcionalidades principais

Cadastro e autenticação de usuários com controle de acesso via Role.

Gerenciamento de produtos: criação, listagem, atualização e exclusão.

Controle de fornecedores e histórico de fornecimento.

Gestão de estoque integrada aos produtos e compras.

Registro de compras e controle de itens de compra.

Cadastro de clientes com histórico de transações.

Módulo de promoções, feedbacks e relatórios de vendas.

Estrutura pronta para integração com Spring Security e JWT.

 # 💻Tecnologias utilizadas

Java 17+

Spring Boot 3

Spring Data JPA / Hibernate

Spring Security (JWT Ready)

Maven

H2 / MySQL

Lombok

MapStruct (para mapeamento DTO ↔ Entity)

 # 🧱Estrutura de Pacotes

com.example.supermarket
├── config/          → Configurações (segurança, CORS, JWT)
├── controller/      → Controladores REST
├── dto/             → Objetos de transferência de dados (DTOs)
├── entity/          → Entidades JPA (mapeamento do banco)
├── repository/      → Interfaces de persistência
├── service/         → Camada de lógica de negócio
├── exception/       → Tratamento de erros e exceções customizadas
├── mapper/          → Conversões entre entidades e DTOs
└── util/            → Utilitários e funções auxiliares


