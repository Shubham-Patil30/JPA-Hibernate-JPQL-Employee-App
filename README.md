# Employee CRUD Operations Using Hibernate JPA and JPQL

## Description

This project demonstrates the implementation of basic CRUD (Create, Read, Update, Delete) operations using Hibernate JPA and JPQL (Java Persistence Query Language). It serves as a practical example of how to interact with a relational database using JPA and JPQL to manage employee records. This project is ideal for those looking to deepen their understanding of how Hibernate and JPA can be used for CRUD operations in Java applications.

## Features

- **Create:** Adds a new employee to the database.
- **Read:** Retrieves employee details using JPQL queries.
- **Update:** Modifies existing employee records in the database.
- **Delete:** Removes an employee from the database.

This project uses Hibernate to map Java objects to database tables and allows interaction with the database in an object-oriented manner using JPQL. The project is structured to handle basic employee management operations and demonstrates the use of Hibernate’s capabilities in performing CRUD actions.

## Technologies Used

- **Java:** The programming language used to implement the application.
- **Hibernate ORM (JPA):** Used to map Java objects to database tables and perform CRUD operations.
- **JPQL (Java Persistence Query Language):** Used for querying the database in an object-oriented manner.
- **MySQL (or any other relational database):** Used as the database to store employee information.
- **Maven:** Used for managing dependencies and building the project.

## Project Structure

- **Employee Entity Class:** Contains the entity class representing an employee and includes the annotations for JPA mapping.
- **DAO Classes:** Provides methods to perform CRUD operations, including the execution of JPQL queries.
- **JPQL Queries:** Demonstrates the use of JPQL for interacting with the database in a structured, object-oriented way.
  
## Annotations and APIs Used

- **@Entity:** Marks the class as a JPA entity.
- **@Table:** Specifies the database table for the entity.
- **@Id:** Marks the primary key of the entity.
- **@GeneratedValue:** Specifies the generation strategy for the primary key.
- **@Query:** Used to define custom JPQL queries in DAO classes.
- **@PersistenceContext:** Used for dependency injection of the `EntityManager`.

## Installation

### Clone the Repository:

```bash
git clone https://github.com/Shubham-Patil30/JPA-Hibernate-JPQL-Employee-App.git

