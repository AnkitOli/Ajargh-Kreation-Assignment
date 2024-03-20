# Ajargh-Kreation-Assignment

# API Documentation

This document provides an overview of the endpoints and operations supported by the API for the assignment of Ajargh Kreation.

## Authentication

The API uses JSON Web Tokens (JWT) for authentication. Clients must include a valid JWT token in each request's `Authorization` header.

## Endpoints

## runs on localhost:8080 and can be customised from application.properties.
## Just use Postman to get, post, put and update to request to perform a function.

### 1. Generate JWT Token

- **URL**: `/login`
- **Method**: `POST`
- **Description**: Generates a JWT token for authentication.
- **Request Body**:
  ```json
  {
      "username": "ankitoli",
      "password": "2002"
  }

### 2. After Authentication

-start requesting the  server using Postman or another API tool with the required body.
-  for the user, the endpoint is http://localhost:8080/user.
-  for admin, the endpoint is http://localhost:8080/admin.
-  for business owners, the endpoint is: http://localhost:8080/business-owner
