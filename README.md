A Spring Boot REST API for managing courses using Oracle Database and JPA.

🚀 Features :

- Create new courses
- View all courses
- View course by ID
- Update existing courses
- Delete courses

🛠 Technologies Used :

 - Java 17
 - Spring Boot 3.2
 - Spring Data JPA
 - Oracle Database
 - Maven


📂 Project Structure

com.springrest
 ├── controller
 ├── services
 ├── repository
 └── model

🔗 API Endpoints
| Method | Endpoint          | Description      |
| ------ | ----------------- | ---------------- |
| GET    | /api/courses      | Get all courses  |
| GET    | /api/courses/{id} | Get course by ID |
| POST   | /api/courses      | Add new course   |
| PUT    | /api/courses      | Update course    |
| DELETE | /api/courses/{id} | Delete course    |
