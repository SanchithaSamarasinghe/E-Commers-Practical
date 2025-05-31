### Day 06 - Connecting to Database
This directory contains excercises completed during Day 06.

# Excercises
Create new App with mySQL Driver and Spring Data JPA dependencies.
Populate application.properties with the database credentials.
Create Department, Employee, Project, and Insurance tables.
Add the proper relationships between the tables.
Run the project and observe the tables in the database.
Getting Started
Clone the Repo and Open project using Spring Tool Suite or other prefered method. Install the necessary dependencies using maven. Run the Applicartion. Visit the localhost:8080 in your browser.

# application.properties
spring.application.name=AppwithDB
spring.datasource.url=jdbc:mysql://localhost:3306/testappdb
spring.datasource.username=testuser
spring.datasource.password=test123
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=create
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect