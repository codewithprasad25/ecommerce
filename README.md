# 🚀 E-Commerce Product Listing API

A production-ready RESTful API built using **Spring Boot 3** for managing products in an E-Commerce system.  
This project demonstrates clean architecture, security integration, database persistence, and API documentation.

---

## 👨‍💻 Author

**Prasad Shinde**  
GitHub: https://github.com/codewithprasad25

---

## 📌 Project Overview

This application provides a secure backend system to manage products with:

- Product CRUD operations
- Authentication endpoint
- Pagination support
- Global exception handling
- PostgreSQL database integration
- Swagger OpenAPI documentation
- Spring Security (Basic Authentication)
- Layered architecture

The system is structured following enterprise-level best practices.

---

## 🛠 Tech Stack

| Technology | Version |
|------------|---------|
| Java | 17+ |
| Spring Boot | 3.x |
| Spring Data JPA | ✔ |
| Spring Security | ✔ |
| PostgreSQL | ✔ |
| Swagger OpenAPI | ✔ |
| Maven | ✔ |

---

## 🏗 Architecture

This project follows a layered architecture:

```
src/main/java/com/example/Listing
│
├── controller       → REST Controllers
├── service          → Business Logic Layer
├── service/impl     → Service Implementations
├── repository       → Data Access Layer (JPA)
├── model            → Entity Classes
├── requestDto       → Request Data Transfer Objects
├── responseDto      → Response Data Transfer Objects
├── security         → Security Configuration
└── exception        → Global Exception Handling
```

This ensures separation of concerns and maintainability.

---

## ⚙️ Setup & Installation

### 1️⃣ Clone Repository

```bash
git clone https://github.com/codewithprasad25/ecommerce.git
cd ecommerce
```

---

### 2️⃣ Configure Database

Update `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ProductListing
spring.datasource.username=**************
spring.datasource.password=**************

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Create database manually in PostgreSQL:

```sql
CREATE DATABASE ProductListing;
```

---

### 3️⃣ Run Application

```bash
mvn spring-boot:run
```

Application runs at:

```
http://localhost:8080
```

---

## 🔐 Authentication

This project uses **HTTP Basic Authentication**.

Default credentials:

```
Username: admin
Password: admin123
```

To test via Swagger:

1. Open Swagger UI
2. Click **Authorize**
3. Enter credentials

---

## 📘 API Documentation

Swagger UI available at:

```
http://localhost:8080/swagger-ui/index.html
```

---

## 📌 API Endpoints

### ➤ Authentication

**POST** `/api/v1/authentication/signin`

Returns confirmation message.

---

### ➤ Create Product

**POST** `/api/v1/products`

```json
{
  "productName": "Laptop",
  "createdBy": "Prasad"
}
```

---

### ➤ Get All Products (Paginated)

**GET** `/api/v1/products?page=0&size=5`

---

### ➤ Get Product By ID

**GET** `/api/v1/products/{id}`

---

### ➤ Update Product

**PUT** `/api/v1/products/{id}`

---

### ➤ Delete Product

**DELETE** `/api/v1/products/{id}`

---

## 📂 Entity Structure

### Product
- id
- productName
- createdBy
- createdOn
- modifiedBy
- modifiedOn
- items (OneToMany)

### Item
- id
- quantity
- product (ManyToOne)

### User
- id
- username
- password
- role

### RefreshToken
- id
- token
- expiryDate
- user

---

## 🛡 Security Configuration

- CSRF disabled (REST API)
- Swagger endpoints publicly accessible
- All other endpoints secured
- BCrypt password encoding
- In-memory user authentication (for demo)

---

## ⚡ Features Implemented

✔ Secure API using Spring Security  
✔ CRUD operations  
✔ Pagination support  
✔ PostgreSQL integration  
✔ JPA relationships (OneToMany, ManyToOne)  
✔ Global exception handling  
✔ Swagger documentation  
✔ Clean layered architecture  

---

## 🧪 Testing

Unit test structure included under:

```
src/test/java
```

Application successfully tested using:

- Swagger UI
- Postman

---

## 📦 Build Executable JAR

```bash
mvn clean package
```

Run JAR:

```bash
java -jar target/ecommerce-0.0.1-SNAPSHOT.jar
```

---

## 📈 Future Improvements

- JWT Authentication
- Role-based authorization (ADMIN / USER)
- Refresh token mechanism
- API versioning
- Logging & monitoring
- CI/CD integration
- Cloud deployment

---

## 📊 Project Outcome

This project demonstrates:

- Enterprise backend architecture
- REST API best practices
- Secure authentication
- Database integration
- Clean and maintainable code structure

It is suitable for:

- Portfolio projects
- Interview demonstration
- Backend development reference

---

## ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.

---
