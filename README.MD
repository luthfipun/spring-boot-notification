# Documentation

Spring boot application for notification event. This sample use asynchronous, coroutines and sample not recommended ways

## TechStack

- SpringBoot (2.7.4)
- MySQL Database
- Coroutines

## APIs

Sample send notification event (added notification data to mysql database)

### Basic (Not Recommended)

#### Request
- Method : GET
- Endpoint : ``/api/notification/basic``
- Header :
  - Accept : application/json

#### Response
- Body :
    ```json
    {
      "status": "boolean",
      "code": "number",
      "message": "string"
    }
    ```

---

### Asynchronous

#### Request
- Method : GET
- Endpoint : ``/api/notification/async``
- Header :
    - Accept : application/json

#### Response
- Body :
    ```json
    {
      "status": "boolean",
      "code": "number",
      "message": "string"
    }
    ```

---

### Coroutine

#### Request
- Method : GET
- Endpoint : ``/api/notification/coroutine``
- Header :
    - Accept : application/json

#### Response
- Body :
    ```json
    {
      "status": "boolean",
      "code": "number",
      "message": "string"
    }
    ```