# User, Product and Order Management API

This is a backend application built with **Spring Framework 3**, using **Java** and **H2 in-memory database**.  
The project provides a RESTful API to manage **users**, **products**, and **orders**. It includes full **CRUD operations** and **exception handling** using a layered architecture.

## 🧱 Architecture

The project follows a standard layered architecture with the following packages:

- `resource` – Controllers exposing RESTful endpoints
- `service` – Business logic and use case orchestration
- `repository` – Data access layer using Spring Data JPA

## 🚀 Features

- CRUD operations for:
  - Users
  - Products
  - Orders
- Exception handling with meaningful error messages
- H2 in-memory database with console enabled for quick inspection

## 🛠️ Technologies

- Java
- Spring Framework 3
- Spring Data JPA
- H2 Database
- Maven

## 📦 Running the Application

Make sure you have Java and Maven installed.

```bash
git clone https://github.com/rebeccazamagnas/spring.git
cd your-repo-name
mvn spring-boot:run
