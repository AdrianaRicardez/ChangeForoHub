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

