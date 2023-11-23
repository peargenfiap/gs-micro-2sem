#  Global Solution - Microservice and Web Engineering Project - Back-End

## Integrantes
- Felipe Otto da Silva - RM: 89108
- Pedro Argentati - RM: 88246
- Rafael Tannous - RM: 87486

## Tecnologias Utilizadas
O projeto foi desenvolvido utilizando as seguintes tecnologias:

- **Java 17**: Versão da linguagem de programação Java utilizada no projeto.
- **Spring Boot 3.0.6**: Versão do Spring Boot utilizada no projeto.

## Dependências
O projeto utiliza as seguintes dependências, conforme especificadas no arquivo `pom.xml`:

- **Spring Data JPA**: Biblioteca que simplifica o acesso a dados com o Spring.
- **Spring JDBC**: Suporte para acesso a dados relacionais com o Spring.
- **Spring Validation**: Biblioteca para validação de dados em aplicações Spring.
- **Spring Web**: Suporte para desenvolvimento de aplicações web com o Spring.
- **Spring Devtools**: Ferramentas de desenvolvimento para o Spring (runtime).
- **Oracle JDBC (ojdbc8)**: Driver JDBC para conexão com o banco de dados Oracle.
- **Project Lombok**: Biblioteca que simplifica a criação de classes Java com menos código boilerplate.
- **Tomcat**: Servidor web embutido do Spring Boot.
- **Spring Boot Test**: Biblioteca de testes para aplicações Spring Boot.
- **Springdoc OpenAPI UI**: Biblioteca para geração de documentação OpenAPI e UI.

# Banco de Dados

## Modelo Físico
```SQL
CREATE TABLE consume (
    indicatorkey CHAR(5) NOT NULL,
    consumeYear NUMBER(4) NOT NULL,
    consumeQuantity NUMBER(4, 2) NOT NULL
);

ALTER TABLE consume ADD CONSTRAINT consume_pk PRIMARY KEY ( indicatorkey );

CREATE TABLE indicator (
    odskey CHAR(3) NOT NULL,
    indicatorkey CHAR(5) NOT NULL,
    indicatorDescription VARCHAR2(300) NOT NULL,
    indicatorName VARCHAR2(300) NOT NULL
);

ALTER TABLE indicator ADD CONSTRAINT indicator_pk PRIMARY KEY ( indicatorkey );

CREATE TABLE ods (
    odskey CHAR(3) NOT NULL,
    globalobjective VARCHAR2(300),
    brazilobjective VARCHAR2 (300)
);

ALTER TABLE ods ADD CONSTRAINT ods_pk PRIMARY KEY ( odskey );

ALTER TABLE consume
    ADD CONSTRAINT consume_indicator_fk FOREIGN KEY ( indicatorkey )
        REFERENCES indicator ( indicatorkey );

ALTER TABLE indicator
    ADD CONSTRAINT indicator_ods_fk FOREIGN KEY ( odskey )
        REFERENCES ods ( odskey );

```

## Modelo Lógico (DER)
![Sem título](https://github.com/peargenfiap/gs-micro-2sem/assets/115407377/e33c4a72-b651-46d0-91d8-f0bcd2589dde)

## Modelo Entidade Relacionamento (MER)
![Sem título](https://github.com/peargenfiap/gs-micro-2sem/assets/115407377/4bb996a5-48de-43ca-8a65-de296f49d8f6)

