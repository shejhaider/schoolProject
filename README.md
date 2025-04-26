
# School System API - Design Documentation

## Overview

This backend system is built using **Spring Boot** to help a private school manage:
- Student records
- Course enrollments
- Academic grades

It provides a RESTful API interface with support for **CRUD operations**, **pagination**, **DTO abstraction**, and **Swagger UI** for testing.

---

##  Architecture

- **Spring Boot** (REST Controller + Service + Repository architecture)
- **JPA (Jakarta Persistence)** for ORM
- **H2 In-memory Database** (easy testing and setup)
- **Gradle** as the build system
- **Swagger/OpenAPI** for API documentation
- **DTOs** to separate entity models from external representation

---

##  Entities & Relationships

### 1. `Student`
- `id`, `firstName`, `lastName`, `email`, `dateOfBirth`
- One-to-Many relationship with `Enrollment`

### 2. `Course`
- `id`, `name`, `code`, `description`
- One-to-Many relationship with `Enrollment`

### 3. `Enrollment`
- `id`, `student`, `course`
- Each enrollment may have one grade

### 4. `Grade`
- `id`, `enrollment`, `grade`
- One-to-One with `Enrollment`

---

## API Endpoints

| Resource | Method | Endpoint | Description |
|----------|--------|----------|-------------|
| Student | GET | `/students` | List all students with pagination |
|         | GET | `/students/{id}` | Get student by ID |
|         | POST | `/students` | Create student |
|         | PUT | `/students/{id}` | Update student |
|         | DELETE | `/students/{id}` | Delete student |
| Course  | GET | `/courses` | List all courses with pagination |
|         | GET | `/courses/{id}` | Get course by ID |
|         | POST | `/courses` | Create course |
|         | PUT | `/courses/{id}` | Update course |
|         | DELETE | `/courses/{id}` | Delete course |
| Enrollment | POST | `/enroll` | Enroll student in multiple courses |
| Grade | POST | `/grade` | Record student grade |
|       | GET | `/grade/{studentId}/{courseId}` | Fetch student's grade for a course |

---

##  DTO Design

- `StudentDTO`, `CourseDTO`, `GradeDTO`, `EnrollmentRequestDTO` are used to:
  - Hide internal structure (like lazy-loading relationships)
  - Validate user input
  - Control output structure

---

## Validation

Bean validations ensure:
- Required fields are not null
- Email format is valid
- Duplicates and invalid data are avoided at the API layer


## Pagination

Endpoints `/students` and `/courses` support pagination via `page` and `size` query parameters.

##  API Documentation

Swagger UI is enabled at:
```
http://localhost:8080/swagger-ui.html
```

This helps developers and testers to interactively explore the API.





##  Running the Project

```bash
./gradlew bootRun
```

Navigate to `http://localhost:8080/swagger-ui.html` to explore the API.

