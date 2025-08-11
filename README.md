# EXPENSE TRACKER

<div align="center">
  <img src="https://github.com/user-attachments/assets/542d899c-7d2f-41ca-bd06-7841a33b61ec" alt="Expense Tracker Logo" width="150"/>
  
  ### *A simple and responsive expense management application* :)
  
  [![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
  [![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.4-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)](https://spring.io/projects/spring-boot)
  [![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)](https://www.mysql.com/)
  [![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)

</div>

---

## What Makes This Special?

**Expense Tracker** is a simple yet effective expense management application built with Spring Boot and Thymeleaf. It provides a clean web interface for managing your personal expenses with a MySQL database backend for reliable data storage.

### Why Choose Our Expense Tracker?

- **Web-Based Interface**: Built with Thymeleaf for responsive web pages
- **Reliable Storage**: MySQL database for persistent data management
- **Spring Boot Power**: Enterprise-grade framework for stability
- **Simple & Clean**: Focused on core expense tracking functionality
- **Easy Deployment**: Standard Spring Boot application structure

---

## Features

<table>
<tr>
<td width="50%">

### **Core Functionality**
- **Expense Management** - Add, view, edit, and delete expenses
- **Web Interface** - Responsive Thymeleaf-based UI
- **Data Persistence** - MySQL database storage
- **Expense Details** - Track title, amount, date, category, and description

</td>
<td width="50%">

### **Technical Stack**
- **Spring Boot 3.5.4** - Main application framework
- **Spring Data JPA** - Database operations
- **Thymeleaf** - Server-side template engine
- **MySQL** - Production database
- **Maven** - Dependency management

</td>
</tr>
</table>

---

## Architecture Overview

```
expense-tracker/
├── src/main/java/com/jayalaxmi/expensetracker/
│   ├── ExpenseTrackerApplication.java     # Spring Boot entry point
│   ├── model/
│   │   └── Expense.java                   # Expense entity
│   ├── controller/
│   │   └── ExpenseController.java         # Web controllers
│   ├── repository/
│   │   └── ExpenseRepository.java         # Data access layer
│   └── service/
│       └── ExpenseService.java            # Business logic
├── src/main/resources/
│   └── templates/                         # Thymeleaf templates
├── src/test/                              # Test classes
├── pom.xml                                # Maven configuration
└── README.md                              # Project documentation
```

---

## Quick Start Guide

### Prerequisites

- **Java 17+** - Required for Spring Boot 3.5.4
- **Maven 3.6+** - For building the project
- **MySQL 8.0+** - Database server
- **Your favorite IDE** - IntelliJ IDEA, Eclipse, or VS Code

### Installation & Setup

**Step 1: Clone the Repository**
```bash
git clone https://github.com/Jaya511laxmi/expense-tracker.git
cd expense-tracker
```

**Step 2: Configure Database**
Create a MySQL database and update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/expense_tracker
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
```

**Step 3: Build and Run**
```bash
# Build the project
./mvnw clean install

# Run the application
./mvnw spring-boot:run
```

### Access the Application

Your expense tracker will be available at:
- **Web Interface**: `http://localhost:8080`
- **Application Health**: Check logs for startup confirmation

---

## Usage

Once the application is running:

1. **Open your browser** and navigate to `http://localhost:8080`
2. **Add expenses** using the web form
3. **View your expenses** in the expense list
4. **Edit or delete** expenses as needed
5. **Track your spending** over time

The Thymeleaf interface provides a clean, responsive web experience for managing your expenses.

---

## Testing

Run the test suite:

```bash
# Run all tests
./mvnw test

# Run tests with detailed output
./mvnw test -X

# Run specific test class
./mvnw test -Dtest=ExpenseTrackerApplicationTests
```

---

## Database Schema

The application uses a simple expense entity with the following structure:

- **ID** - Primary key (auto-generated)
- **Title** - Expense description
- **Amount** - Expense amount
- **Date** - Date of expense
- **Category** - Expense category
- **Description** - Additional details

---

## Contributing

We welcome contributions! Here's how you can help:

### How to Contribute

1. **Fork** the repository
2. **Create** a feature branch (`git checkout -b feature/amazing-feature`)
3. **Make** your changes
4. **Test** thoroughly (`./mvnw test`)
5. **Commit** your changes (`git commit -m 'Add amazing feature'`)
6. **Push** to the branch (`git push origin feature/amazing-feature`)
7. **Open** a Pull Request

### Development Guidelines

- Follow Spring Boot best practices
- Write tests for new functionality
- Keep the UI simple and responsive
- Maintain clean, readable code

---

## Acknowledgments

- **Spring Boot Team** - For the excellent framework
- **Thymeleaf Team** - For the powerful templating engine
- **MySQL** - For reliable database management
- **Maven** - For dependency management

---

<div align="center">

**Built by [Jaya Laxmi](https://github.com/Jaya511laxmi)**

*Simple expense tracking made easy*

</div>
