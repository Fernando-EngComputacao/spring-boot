
# Spring Boot Project - Fernando Furtado :boy:
Este é um projeto Java Spring Boot Java.   
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)  
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://choosealicense.com/licenses/gpl-3.0/)  
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](https://choosealicense.com/licenses/gpl-3.0/)

# Sites de acesso 
1. [Spring Start](https://start.spring.io/) 
2. [Insomnia](https://insomnia.rest/download) 
  

## Configurações do projeto no Spring Start  
- **Project:** Maven Project 
- **Language:** Java
- **Spring Boot:** 2.7.4
- **Packagem:** JAR
- **Java:** 11
- **Dependeces:** 
    - Spring Web
    - H2 Database
    - Spring Data JPA
    - Spring Boot DevTools
    - Spring Data JDBC
    - Validation

 ## Properties (application.properties)
**Propriedades:** entre em -> src/main/resources/application.properties
~~~bash  
server.port=8081

# data source
spring.datasource.driver-class-name=org.h2.Driver
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:alura-forum
spring.datasource.username=sa
spring.datasource.password=

# jpa
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.hibernate.ddl-auto=update
spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.format_sql=true

# Nova propriedade a partir da versao 2.5 do Spring Boot:
spring.jpa.defer-datasource-initialization=true

# h2
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
~~~

**Base de dados:** entre em -> src/main/resources e crie um documento de nome (data.sql). Após copie e cole o código abaixo: 

~~~bash  
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Advenders Ultimato','Fantasia',215,1);
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Avatar 2','Aventura',255,2);
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Procurando Nemo','Fantasia',185,3);
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Minha mãe é uma peça','Drama',225,4);
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Adão Negro','Fantasia',205,5);
INSERT INTO MOVIE(nome, genero, duracao, posicao) VALUES('Iti','Terror',195,6);
~~~

