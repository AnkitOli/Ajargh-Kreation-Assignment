# Ajargh-Kreation-Assignment

# API Documentation

This document provides an overview of the endpoints and operations supported by the API for the assignment of Ajargh Kreation.

## Authentication

The API uses JSON Web Tokens (JWT) for authentication. Clients must include a valid JWT token in each request's `Authorization` header.

## Endpoints

## runs on localhost:8080 and can be customised from application.properties.
## just use postman to get, post, put and update to request in order to perform function.

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
