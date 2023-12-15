# Simple Blog Backend Application Documentation
**Overview**

This is a simple blog backend application built using the **Spring framework**. It provides basic CRUD operations for managing blog posts and includes basic **authentication** using **Spring Security**. The application uses an in-memory **H2 database** for data storage.
**Project Structure**

    Post.java: Entity class representing a blog post with fields such as id, title, text, and creationDate.
    PostRepository.java: Interface extending JpaRepository for performing CRUD operations on posts.
    PostService.java: Service interface defining methods for interacting with blog posts.
    PostServiceImpl.java: Service implementation providing methods for the CRUD operations on posts.
    PostController.java: REST controller exposing endpoints for managing blog posts.
    SecurityConfig.java: Security configuration class extending SecurityConfigurerAdapter to configure basic authentication and authorization.

**Dependencies**

The project is a **Gradle project** and includes the following dependencies:

    spring-boot-starter-data-jpa: Spring Boot starter for JPA data access.
    spring-boot-starter-security: Spring Boot starter for security.
    spring-boot-starter-web: Spring Boot starter for building web applications.
    com.h2database:h2: H2 database for in-memory data storage.
    org.springframework.boot:spring-boot-starter-test: Spring Boot starter for testing.

**Configuration**

    Database Configuration: The application is configured to use an **H2 in-memory database**. Database configuration is specified in application.properties.

    properties

    spring.datasource.url=jdbc:h2:mem:testdb
    spring.datasource.driverClassName=org.h2.Driver
    spring.datasource.username=sa
    spring.datasource.password=password
    spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

    Security Configuration: Basic security configuration is provided in SecurityConfig.java. The configuration allows access to /api/posts only for authenticated users.

**Endpoints**

    GET /api/posts: Retrieve all blog posts.
    GET /api/posts/{id}: Retrieve a specific blog post by ID.
    POST /api/posts: Create a new blog post.
    DELETE /api/posts/{id}: Delete a blog post by ID.

**Authentication**

    Username: user
    Password: password

The application uses basic authentication for accessing the endpoints. Update the security configuration and user details service for a more secure authentication mechanism in a production environment.
