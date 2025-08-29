Spring Boot Mini Project - Items Management

This is a Spring Boot Mini Project developed using Spring Boot, Spring JDBC, MySQL, and JSP.
It demonstrates how to build a simple web-based application for managing Items (with ID, Name, and Price).

🚀 Features

Add new items with ID, name, and price.

Store items in a MySQL database.

Simple and clean architecture using:

Spring MVC (Controller, Service)

Spring JDBC (JdbcTemplate)

MySQL Database

JSP views for frontend interaction.

🛠️ Tech Stack

Java 17

Spring Boot 3.5.4

Spring Web (Spring MVC)

Spring JDBC (JdbcTemplate)

MySQL Database

Lombok (for reducing boilerplate code)

JSP (Java Server Pages)

Maven (for dependency management)

📂 Project Structure
src/main/java/com/gqt
    ├── Items.java                        # Entity/Model class
    ├── controller/ItemController.java    # Handles HTTP requests
    ├── service/ItemService.java          # Business logic & DB operations

src/main/resources
    ├── application.properties            # MySQL DB configurations

src/main/webapp/WEB-INF/views
    ├── SuccessItems.jsp                  # Success page after adding item

⚙️ Setup Instructions
1️⃣ Clone the repository
git clone https://github.com/your-username/springboot-miniproject.git
cd springboot-miniproject

2️⃣ Configure Database

Create a MySQL database and table:

CREATE DATABASE gqt;

USE gqt;

CREATE TABLE items (
    item_id INT PRIMARY KEY,
    item_name VARCHAR(100),
    item_price FLOAT
);


Update src/main/resources/application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/gqt
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

3️⃣ Run the Application

Using Maven:

mvn spring-boot:run


Or run the main class from your IDE.

🌐 Usage

Start the server.

Access the app at:
👉 http://localhost:8080/addItem

Enter item details and submit.

The data will be saved in the MySQL items table.

You will be redirected to SuccessItems.jsp.

📦 Dependencies

spring-boot-starter-web

spring-boot-starter-jdbc

mysql-connector-j

lombok

tomcat-jasper

👨‍💻 Author

Developed by Sony Karnati
📧 Feel free to connect on LinkedIn
 or contribute to this repo!

📝 License

This project is licensed under the MIT License - feel free to use and modify it.
