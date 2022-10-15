
# Spring Boot Project
Este é um projeto Java Spring Boot Java.   

## Badges  

Add badges from somewhere like: [shields.io](https://shields.io/)  
[![MIT License](https://img.shields.io/badge/License-MIT-green.svg)](https://choosealicense.com/licenses/mit/)  
[![GPLv3 License](https://img.shields.io/badge/License-GPL%20v3-yellow.svg)](https://choosealicense.com/licenses/gpl-3.0/)  
[![AGPL License](https://img.shields.io/badge/license-AGPL-blue.svg)](https://choosealicense.com/licenses/gpl-3.0/)

# Site de acesso 
1. [Spring Start](https://start.spring.io/)  
  

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
~~~

Install dependencies  

~~~bash  
npm install
~~~

Start the server  

~~~bash  
npm run start
~~~

## Environment Variables  

To run this project, you will need to add the following environment variables to your .env file  
`API_KEY`  

`ANOTHER_API_KEY` 

## Acknowledgements  

- [Awesome Readme Templates](https://awesomeopensource.com/project/elangosundar/awesome-README-templates)
- [Awesome README](https://github.com/matiassingers/awesome-readme)
- [How to write a Good readme](https://bulldogjob.com/news/449-how-to-write-a-good-readme-for-your-github-project)

## Feedback  

If you have any feedback, please reach out to us at fake@fake.com

## License  

[MIT](https://choosealicense.com/licenses/mit/)

