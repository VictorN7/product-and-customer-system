# 📦 Product and Consumer System

E-commerce / marketplace backend built with Java 21 and Spring Boot 4, designed to simulate real-world business scenarios with a strong focus on clean architecture, scalability, and production-ready practices.

The project was built with real production concerns in mind, including cloud deployment, environment-based configuration, global error handling, and API documentation.

## 🧠 Key Technical Highlights

- Well-defined layered architecture (Controller → Service → Repository)
- Domain modeling with complex relationships (OneToMany, ManyToMany, and composite keys) following JPA best practices
- Centralized exception handling using `@ControllerAdvice`
- Environment separation (development and production)
- Full cloud deployment with remote database
- REST API documented using Swagger / OpenAPI
- Clean, organized, and scalable code structure

## 🚀 Technologies

- Java 21
- Spring Boot 4
- Spring Data JPA / Hibernate
- PostgreSQL (production)
- H2 Database (development/testing)
- Swagger / OpenAPI (SpringDoc)
- Maven

## ☁️ Deployment & Configuration

The project is deployed on Railway, featuring:

- Spring Boot backend running in production
- Managed PostgreSQL database in the cloud
- Environment variable-based configuration
- Secure connection between application and database
- Remote database access for local administration (pgAdmin / DBeaver)

**This setup enables easy environment switching, scalability, and alignment with deployment standards commonly used in corporate applications.**

## 🖥️ Production Environment

Below is evidence of the system running in a real production environment:

- Spring Boot backend running on Railway
- Remote PostgreSQL database integrated
- REST requests executed via Postman
- HTTP logs confirming 200 OK responses


<img width="1910" alt="projeto finalizado" src="https://github.com/user-attachments/assets/b4093263-0f1c-4011-a32c-c0006420e927" />


## 🏗️ Architecture

```txt
com.victornogueira.productandconsumer
├── config
├── entities
├── repositories
├── resources
├── services
└── exceptions
```

**Entities:** Domain rules and structure

**Repositories:** Data persistence layer (JPA)

**Services:** Business logic layer

**Resources:** REST API layer

**Exceptions:** Global error handling

**Config:** Environment and application configuration


## 🔗 Endpoints Overview

### Users

- `POST /users` – create consumer
- `GET /users` – list consumers
- `GET /users/{id}` – find by ID
- `PUT /users/{id}` – update consumer
- `DELETE /users/{id}` – remove consumer

### Products

- `GET /products` – list products with categories
- `GET /products/{id}` – product details

### Categories

- `GET /categories`
- `GET /categories/{id}`

### Orders

- `GET /orders` – list orders with items, consumer, and calculated total value
- `GET /orders/{id}` – full order details

📌 All endpoints follow REST best practices, including proper HTTP status code usage (200, 201, 204, 404).

## 🧪 Testing

- Tests executed during development
- H2 in-memory database usage
- Validation of service and persistence layers

## 📄 API Documentation

The API is automatically documented via Swagger / OpenAPI:

```
/swagger-ui/index.html
```

## 🎯 Professional Purpose of the Project

This project aims to:

- Demonstrate practical mastery of Spring Boot
- Apply real-world architecture and code organization
- Work with real relational persistence and complex entity relationships
- Serve as a foundation for future enhancements, such as:
  - Spring Security / JWT
  - Caching
  - Microservices architecture
  - Messaging systems


## ▶️ How to Run the Project

### 1️⃣ Clone the repository

```
git clone https://github.com/VictorN7/product-and-customer-system.git

cd product-and-customer-system
```

### 2️⃣ Configure the Database

Make sure you have PostgreSQL running locally, or configure the database connection properties in `application-dev.properties`.

For development purposes, the project can also run using the H2 in-memory database profile.

### 3️⃣ Run the application

```
./mvnw spring-boot:run
```

Or run directly from your IDE.

## 👤 Author

Victor Nogueira  
Backend Developer | Java & Spring Boot  
