# Spring Boot Boilerplate

This repository serves as a boilerplate for Spring Boot applications. It includes configurations for PostgreSQL, Redis, Flyway, and other essential dependencies, making it a solid starting point for any backend project.

## Features
- **Spring Boot 3.x** with Java 21
- **PostgreSQL** integration
- **Redis** caching setup
- **Flyway** for database migrations
- **Spring Data JPA** for ORM
- **Lombok** for reducing boilerplate code
- **Spring Boot Actuator** for monitoring

## Setup Instructions
### Prerequisites
- Java 21
- Maven 3.9+
- Docker (for PostgreSQL & Redis)
- Git

### Clone the Repository
```sh
git clone https://github.com/b17saurabh/sprint-app.git
cd sprint-app
```

### Environment Variables
Use a `.env` file or set environment variables in your system.

Example:
```sh
export SPRING_DATASOURCE_URL=jdbc:postgresql://localhost:5432/demodb
export SPRING_DATASOURCE_USERNAME=admin
export SPRING_DATASOURCE_PASSWORD=admin
export SPRING_REDIS_HOST=localhost
export SPRING_REDIS_PORT=6379
```

### Run with Docker (Optional)
To start PostgreSQL and Redis using Docker:
```sh
docker-compose up -d
```

### Run the Application
```sh
mvn spring-boot:run
```

## API Endpoints
| Method | Endpoint       | Description         |
|--------|--------------|---------------------|
| GET    | `/users`     | Fetch all users    |

## Contribution
This repository is maintained as a boilerplate. Feel free to create PRs for improvements.

## License
This project is licensed under the MIT License.

