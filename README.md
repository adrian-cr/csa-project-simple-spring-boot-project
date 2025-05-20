# Simple Spring Boot Project

This project features all the necessary components of a Spring Boot REST API
application that manages student records using JPA/Hibernate for data persistence
and a MySQL database for data storage and management.

## Main Features

* CRUD operations for student management
* RESTful API endpoints
* JPA/Hibernate integration
* H2/MySQL database support

## Setup
You can run this project by following the steps below:
1. Clone the repository
2. Configure database settings in `application.properties`
3. Run `mvn spring-boot:run`
4. Access the API at `http://localhost:8080/api/students/`

## API Operations
The project performs the following operations:
* **Get all students**
  * _HTTP method:_ `GET`
  * _API endpoint:_ `/api/students/`
* **Get student by ID**
  *  _HTTP method:_ `GET`
  *  _API endpoint:_ `/api/students/{studentId}`
* **Create student**
  *  _HTTP method:_ `POST`
  * _API endpoint:_ `/api/students/`
  * _JSON body:_ { "name":"...", "email":"...", "age":... }
* **Update a student**
  *  _HTTP method:_ `PUT`
  * _API endpoint:_ `/api/students/{studentId}?name=...&email=...&age=...`
* **Delete a student**
  *  _HTTP method:_ `DELETE`
  * _API endpoint:_ `/api/students/{studentId}`