# springboot-learning-1

Pequeño proyecto de aprendizaje con Spring Boot para crear una API REST básica usando Java 17, JPA y H2.

## Tecnologías
- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

## Cómo ejecutar
- Abrir el proyecto en IntelliJ
- Ejecutar la clase DemoApplication.java
- La aplicación se inicia en http://localhost:8080

## Endpoints

- **GET http://localhost:8080/usuarios**  
  Lista todos los usuarios registrados. 

- **GET http://localhost:8080/usuarios/{id}**  
  Busca un usuario específico por su ID. 

- **POST http://localhost:8080/usuarios**  
  Crea un nuevo usuario. (Requiere JSON en el Body). 

- **DELETE http://localhost:8080/usuarios/{id}**  
  Elimina un usuario por su ID.
