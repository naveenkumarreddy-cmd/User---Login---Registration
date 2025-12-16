

#  User Login & Registration – Spring Boot

A **full-stack login and registration application** built using **Spring Boot, MySQL, and HTML/CSS/JavaScript**.

---

##  Features

* User Registration
* User Login & Validation
* REST APIs
* MySQL Database Integration
* Maven Project Structure

---

## 🛠️ Tech Stack

* **Backend:** Java, Spring Boot, Spring Data JPA
* **Frontend:** HTML, CSS, JavaScript
* **Database:** MySQL

---

## 📂 Project Structure

```
src/main/java/com/nkr
 ├── controller
 ├── service
 ├── repository
 └── entity

src/main/resources/static
 ├── index.html
 ├── css/style.css
 └── js/login.js
```

---

## 🔗 API Endpoints

* `POST /register` → Register new user
* `POST /login` → Login existing user

---

## ⚙️ Configuration (`application.properties`)

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/database_name
spring.datasource.username=yourmysqlusername
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

---

##  Run the Project

1. Import as Maven project in Eclipse
2. Run as **Spring Boot App**
3. Open browser:

```
http://localhost:8080/
```

---

##  Future Enhancements

* BCrypt password encryption
* JWT authentication
* Spring Security




