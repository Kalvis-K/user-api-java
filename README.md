# User API (Java + Spring Boot)
A simple REST API built with Spring Boot that provides user information and their posts.

Features
✅ Get user details
✅ Get user posts
✅ Fake data for testing
✅ Unit tests included


## Getting Started
### 1. Clone the Repository
```
git clone https://github.com/Kalvis-K/user-api-java.git
cd user-api-java
```

### 2. Build and Run the API

Using Gradle:
```
./gradlew bootRun
```

The API will start at http://localhost:8080 🚀

### API Endpoints
| Method        | Endpoint               | Description      |
| ------------- | ---------------------- | ---------------- |
| GET           | /api/users/{id}        | Get user by ID   |
| GET           | /api/users/{id}/posts  | Get user’s posts |


Example request:
```
curl http://localhost:8080/api/users/1
```

Example response:
```
{
  "id": 1,
  "name": "John Doe",
  "email": "john.doe@example.com"
}
```
