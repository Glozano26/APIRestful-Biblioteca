# Prueba Técnica - Spring Boot Application

## Descripción

Esta prueba técnica tiene como objetivo evaluar los conocimientos básicos y habilidades en el desarrollo de aplicaciones web utilizando Java y el framework Spring Boot. El candidato deberá demostrar su capacidad para trabajar con DTOs, integrar una base de datos, implementar autenticación y realizar operaciones CRUD siguiendo una arquitectura limpia y moderna.

## Requisitos

1. **Lenguaje:** Java (versión 8+)
2. **Framework:** Spring Boot (versión 2.5+)
3. **Base de Datos:** MySQL, PostgreSQL, o H2 (para pruebas locales)
4. **Control de versiones:** Git
5. **Herramientas recomendadas:** IntelliJ IDEA, Eclipse, VSCode o cualquier IDE de su preferencia.

## Descripción del Proyecto

### Contexto

El proyecto consiste en desarrollar una API RESTful para la gestión de una biblioteca de libros. La API debe permitir la gestión de usuarios, libros y la autenticación de usuarios para acceder a ciertas funcionalidades.

### Requisitos Funcionales

1. **Usuarios:**
   - Registrar un nuevo usuario.
   - Autenticar a los usuarios mediante JWT (JSON Web Tokens).
   - Obtener el perfil del usuario autenticado.

2. **Libros:**
   - Crear un nuevo libro.
   - Obtener la lista de libros.
   - Obtener los detalles de un libro específico.
   - Actualizar la información de un libro.
   - Eliminar un libro.

### Requisitos Técnicos

1. **DTO (Data Transfer Object):**
   - Utilizar DTOs para transferir datos entre el cliente y el servidor, y entre capas del sistema.

2. **Base de Datos:**
   - Usar una base de datos relacional para almacenar la información de usuarios y libros.
   - Implementar el acceso a datos mediante Spring Data JPA.

3. **Autenticación y Autorización:**
   - Implementar la autenticación de usuarios utilizando JWT.
   - Proteger las rutas de la API que requieren autenticación.

4. **Arquitectura:**
   - Seguir principios de arquitectura limpia y moderna, separando claramente las capas de presentación, negocio y acceso a datos.
   - Implementar un patrón de diseño adecuado para el servicio de autenticación y gestión de usuarios y libros.

## Guía Técnica

### 1. Configuración del Proyecto

1. **Crear un nuevo proyecto Spring Boot:** Utiliza Spring Initializr o tu IDE para configurar un nuevo proyecto Spring Boot con las siguientes dependencias:
   - Spring Web
   - Spring Data JPA
   - Spring Security
   - H2 Database (para pruebas locales)
   - MySQL/PostgreSQL Driver (según tu elección de base de datos)
   - Spring Boot DevTools (opcional)

2. **Configuración de la Base de Datos:** Configura la conexión a la base de datos en el archivo `application.properties` o `application.yml`.

### 2. Implementación de Entidades y DTOs

1. **Entidades JPA:** Define las entidades `User` y `Book` con los atributos necesarios.
2. **DTOs:** Crea DTOs para transferir los datos de los usuarios y los libros, por ejemplo, `UserDTO` y `BookDTO`.

### 3. Repositorios y Servicios

1. **Repositorios:** Crea interfaces de repositorio para `User` y `Book` extendiendo `JpaRepository`.
2. **Servicios:** Implementa servicios para gestionar las operaciones de usuarios y libros, utilizando los repositorios creados.

### 4. Autenticación y Seguridad

1. **Configuración de Seguridad:** Configura Spring Security para gestionar la autenticación y autorización.
2. **JWT:** Implementa una clase para generar y validar JWTs.
3. **Filtros de Seguridad:** Crea filtros de autenticación para proteger las rutas de la API.

### 5. Controladores

1. **Controlador de Usuarios:** Implementa endpoints para registrar usuarios y obtener el perfil del usuario autenticado.
2. **Controlador de Libros:** Implementa endpoints para crear, leer, actualizar y eliminar libros.

### 6. Pruebas

1. **Pruebas Unitarias:** Escribe pruebas unitarias para los servicios y controladores utilizando JUnit y Mockito.
2. **Pruebas de Integración:** Realiza pruebas de integración para verificar el comportamiento completo del sistema.

## Challenge

El candidato debe clonar el repositorio, implementar las funcionalidades descritas y asegurarse de que todas las pruebas pasen. Además, se espera que el código siga las mejores prácticas de codificación y documentación.

### Criterios de Evaluación

1. **Correctitud Funcional:** La API debe cumplir con todos los requisitos funcionales especificados.
2. **Calidad del Código:** Se evaluará la calidad del código, incluyendo la estructura, la claridad y la adherencia a las mejores prácticas.
3. **Pruebas:** Se valorará la cobertura y calidad de las pruebas unitarias e integración.
4. **Documentación:** Se espera una buena documentación del código y una descripción clara de cómo ejecutar la aplicación y las pruebas.

## Entrega

1. Realiza un fork de este repositorio.
2. Crea una nueva rama con tu nombre (`feature/tu-nombre`).
3. Realiza los commits necesarios en tu rama.
4. Al finalizar, realiza un pull request con una descripción de tu trabajo.

¡Buena suerte y gracias por tu interés!