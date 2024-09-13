# Java Connection Pooling Implementation

This repository demonstrates the implementation of **Connection Pooling** in Java using three different types of connection pools:

1. **DriverManagerDataSource** from Spring Framework
2. **HikariDataSource** from HikariCP (a high-performance JDBC connection pool)
3. **ComboPooledDataSource** from C3P0 (an open-source JDBC connection pool)

## Overview

Connection pooling is a technique to improve performance by reusing database connections instead of creating new ones each time a connection is requested. This project illustrates how to configure and use these connection pools for efficient database connection management.

## Project Setup

To run this project, you'll need:

- **Java 8+**
- **Maven** or **Gradle** (for dependency management)
- **MySQL** or any other RDBMS for database connectivity (change connection details in the configuration)

### Libraries Used

- **Spring Framework** (for `DriverManagerDataSource`)
- **HikariCP** (for `HikariDataSource`)
- **C3P0** (for `ComboPooledDataSource`)
- **MySQL Connector/J** (JDBC driver for MySQL)

## How to Run

### 1. Clone the Repository

```bash
git clone [https://github.com/your-username/your-repo-name.git](https://github.com/Abhinav-gupta103/ConnectionPool.git)
cd ConnectionPool
```

### 2. Configure the Database Connection
Before running the project, ensure that you configure the connection properties such as URL, username, and password for your database in the application.properties file (or wherever you've set your configurations).


### 3. Build and Run
You can build and run the project using Maven or Gradle:

Maven
```bash
mvn clean install
mvn spring-boot:run
```

Gradle
```bash
./gradlew clean build
./gradlew bootRun
```


### Feel free to contribute, open issues, or make pull requests!
### Steps:
- Replace the placeholder repository URL (`https://github.com/Abhinav-gupta103/ConnectionPool`) with the actual URL of your GitHub repository.
- If you have an `application.properties` or equivalent configuration file, mention that clearly in the **"Configure the Database Connection"** section.
- Adjust dependencies in the **Libraries Used** section based on your actual project setup.
