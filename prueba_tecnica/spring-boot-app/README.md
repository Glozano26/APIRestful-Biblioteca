# Spring Boot Application - Biblioteca

## Descripción

Este proyecto es una API RESTful desarrollada con Spring Boot que gestiona una biblioteca de libros y autores. La aplicación permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre las entidades `Autor` y `Libro`. Los datos se almacenan en una base de datos relacional y se gestionan mediante JPA (Java Persistence API).

## Estructura del Proyecto

El proyecto está organizado en los siguientes paquetes:

- **controller**: Contiene los controladores que manejan las solicitudes HTTP.
- **dto**: Contiene los objetos de transferencia de datos (DTOs) que facilitan la comunicación entre las diferentes capas de la aplicación.
- **model**: Contiene las entidades JPA que se mapean a las tablas de la base de datos.
- **repository**: Contiene las interfaces JPA que se encargan de la persistencia de los datos.
- **service**: Contiene la lógica de negocio de la aplicación.

## Requisitos Previos

Antes de ejecutar esta aplicación, asegúrate de tener instalados los siguientes requisitos:

- **Java 17** o superior.
- **Maven** (para la gestión de dependencias).
- **Base de datos MySQL** (u otra base de datos compatible con JPA).

## Configuración de la Base de Datos

1. **Crear la Base de Datos**: 
   - Crea una base de datos llamada `biblioteca` en tu servidor MySQL.

2. **Configurar `application.properties`**: 
   - En el archivo `src/main/resources/application.properties`, configura las propiedades de conexión a la base de datos:

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
   spring.datasource.username=tu_usuario
   spring.datasource.password=tu_contraseña
   spring.jpa.hibernate.ddl-auto=update
   spring.jpa.show-sql=true
   spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect

## Ejecución de la Aplicación
### Clonar el Repositorio:

- Clona el repositorio del proyecto en tu máquina local```
git clone https://github.com/Glozano26/prueba_tecnica```
Compilar y Construir el Proyecto:

- Navega al directorio raíz del proyecto y ejecuta Maven para `construir el proyecto` compilar y resolver las dependencias ejecuta:
   ```
   mvn clean install
   ```
- Ejecutar la Aplicación para inicializarla con el siguiente comando:
   ```
   mvn spring-boot:run
   ```
   deberás estar en consola en donde está el archivo (pom.xml) para ejecutar el comando.

## Acceder a la API:

La aplicación se ejecutará en http://localhost:8080. Puedes acceder a los diferentes endpoints de la API utilizando herramientas como Postman o cURL.

### Endpoints Disponibles:

**AutorController:**
- POST /api/v1/biblioteca: Guarda un nuevo autor.
- GET /api/v1/biblioteca: Obtiene una lista de todos los autores.
- GET /api/v1/biblioteca/{id}: Obtiene un autor por su ID.
- DELETE /api/v1/biblioteca/{id}: Elimina un autor por su ID.

**LibroController**:
- POST /api/v1/libros: Guarda un nuevo libro.
- GET /api/v1/libros: Obtiene una lista de todos los libros.
- GET /api/v1/libros/{id}: Obtiene un libro por su ID.
- DELETE /api/v1/libros/{id}: Elimina un libro por su ID.


## Configuración de Seguridad
La aplicación utiliza Spring Security con autenticación básica HTTP. Por defecto, todos los puntos de extremo requieren autenticación.

### Detalles de Configuración:

* Las configuraciones de seguridad están definidas en la clase Security.java.
* La protección CSRF está deshabilitada para simplificar este proyecto.
* Asegúrate de que cualquier dato sensible o entorno de producción tenga las medidas de seguridad adecuadas.