# ChangeForoHub
ChangeForoHub de Alura Latam

# Challenge_Foro_Hub: Proyecto API con Spring Boot

## Descripción del Proyecto

Este proyecto consiste en una API desarrollada con Spring Boot, diseñada para gestionar tópicos y autenticar usuarios. La API ofrece endpoints para crear, leer, actualizar y eliminar tópicos, además de permitir la autenticación de usuarios mediante tokens JWT.

## Dependencias

Las principales dependencias utilizadas en este proyecto son:

- **Spring Boot Starter Web**: Para crear aplicaciones web.
- **Spring Boot Starter Data JPA**: Para interactuar con la base de datos.
- **Spring Boot Starter Security**: Para la autenticación y autorización de usuarios.
- **Spring Boot Starter Validation**: Para la validación de datos.
- **Jakarta Persistence API (JPA)**: Para el mapeo de entidades a la base de datos.
- **Lombok**: Para reducir el boilerplate en el código.
- **H2 Database**: Base de datos en memoria utilizada para desarrollo y pruebas.

## Endpoints

### Autenticación de Usuarios

#### POST /login

Este endpoint autentica a un usuario y devuelve un token JWT.

**Request Body:**

```json
{
  "login": "usuario",
  "clave": "password"
}

Gestión de Tópicos
GET /topicos
Obtiene una lista paginada de tópicos activos.

URL: http://localhost:8080/topicos

Response:

[
  {
    "id": 1,
    "titulo": "Titulo del tópico",
    "autor": "Autor del tópico",
    "mensaje": "Mensaje del tópico",
    "curso": "Curso relacionado",
    "fechaCreacion": "2023-07-07T16:27:18"
  },
  ...
]

GET /topicos/{id}
Obtiene los detalles de un tópico específico por su ID.

Response:

{
  "id": 1,
  "titulo": "Titulo del tópico",
  "autor": "Autor del tópico",
  "mensaje": "Mensaje del tópico",
  "curso": "Curso relacionado",
  "fechaCreacion": "2023-07-07T16:27:18"
}

POST /topicos
Registra un nuevo tópico.

Request Body:

{
  "titulo": "Titulo del tópico",
  "mensaje": "Mensaje del tópico",
  "curso": "Curso relacionado"
}

Response:
{
  "id": 1,
  "titulo": "Titulo del tópico",
  "autor": "Autor del tópico",
  "mensaje": "Mensaje del tópico",
  "curso": "Curso relacionado",
  "fechaCreacion": "2023-07-07T16:27:18"
}

PUT /topicos/{id}
Actualiza los datos de un tópico existente.

Request Body:

{
  "titulo": "Nuevo titulo del tópico",
  "mensaje": "Nuevo mensaje del tópico"
}

Response:

{
  "id": 1,
  "titulo": "Nuevo titulo del tópico",
  "autor": "Autor del tópico",
  "mensaje": "Nuevo mensaje del tópico",
  "curso": "Curso relacionado",
  "fechaCreacion": "2023-07-07T16:27:18"
}

DELETE /topicos/{id}
Elimina (desactiva) un tópico existente.

Response: 204 No Content

Instrucciones de Configuración
Clona el repositorio.
Asegúrate de tener instalado Java JDK 11.
Configura tu entorno de desarrollo (IDE) con Spring Boot.
Ejecuta el proyecto con ./mvnw spring-boot:run o utilizando tu IDE.
Base de Datos
Este proyecto utiliza una base de datos en memoria H2 para desarrollo y pruebas. La configuración de la base de datos se encuentra en el archivo application.properties.

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true

Puedes acceder a la consola H2 en http://localhost:8080/h2-console con las credenciales configuradas.