# User Management System (UMS) API

This repository contains the backend code for a User Management System API implemented in Java using the Spring Boot framework. The API provides endpoints for managing user information.

## Table of Contents

- [Controller](#controller)
- [Endpoints](#endpoints)

## Controller

### UMSController

#### `addUser`

- **Endpoint:** `POST /user`
- **Description:** Adds new user(s) to the system.
- **Request Body:**
  - `List<UserManagement>`: List of user details to be added.
- **Response:** Returns a message indicating the success of the user addition.

#### `getUserById`

- **Endpoint:** `GET /userById/id/{id}`
- **Description:** Retrieves user(s) by ID.
- **Path Variables:**
  - `id`: ID of the user.
- **Response:** Returns a list of users matching the specified ID.

#### `getUsers`

- **Endpoint:** `GET /users`
- **Description:** Retrieves all users from the system.
- **Response:** Returns a list of all users.

#### `updateUserInfo`

- **Endpoint:** `PUT /updateUserInfo/id/{id}/name`
- **Description:** Updates the name of a user by ID.
- **Path Variables:**
  - `id`: ID of the user to be updated.
- **Request Parameters:**
  - `name`: New name for the user.
- **Response:** Returns a message indicating the success of the user information update.

#### `deleteUser`

- **Endpoint:** `DELETE /user`
- **Description:** Deletes a user by ID.
- **Request Parameters:**
  - `id`: ID of the user to be deleted.
- **Response:** Returns a message indicating the success of the user deletion.

## Model

### UserManagement

```java
// Your UserManagement entity class definition goes here
