# PS-2018-1-EventoFacil
Projeto de software de de gerenciamento de Eventos.

# FutCamp
Software para gerenciar eventos desenvolvido para a matéria de Projeto de Software.

# Integrantes

* [Renato]
* [Igor Montenegro](https://github.com/IgorMontenegro)
* [Max]

## Tecnologias Utilizadas

* Spring
* JSP
* PostgreSQL
* Maven
* Shippable
* Junit
* Java

# Pré-Requisitos

* PostgreSQL - [Download](https://www.enterprisedb.com/downloads/postgres-postgresql-downloads#windows) 
  - usuario: postgres
  - senha: admin

## Obtendo o projeto

`git clone

## Antes de executar

- Crie um banco no PostgreSQL com o nome <b>bd-campeonato</b>

## Executando a aplicação

`mvn org.apache.tomcat.maven:tomcat7-maven-plugin:run -Dmaven.tomcat.port=9090`

## Acessando a aplicação

Acesse `http://localhost:9090/eventofacil` em qualquer navegador.

## Dados de acesso

- Usuário: admin@admin.com.br
- Senha: 123456

	* Caso seja necessário (não estiver logando), rodar as seguintes consultas:
	- value = "insert into Role values ('ROLE_ADMIN')
	- insert into Usuario (email, nome, senha) values ('admin@admin.com.br', 'Administrador', '$2a$04$qP517gz1KNVEJUTCkUQCY.JzEoXzHFjLAhPQjrg5iP6Z/UmWjvUhq')
	- insert into Usuario_Role(Usuario_email, roles_nome) values ('admin@admin.com.br', 'ROLE_ADMIN')

## Como o projeto foi construído

### "Embutindo" o Maven

Para que não seja necessário instalar e configurar o Maven, ele foi embutido no projeto com o seguinte comando:

`mvn io.takari:maven:0.3.3:wrapper -Dmaven=3.3.9`
