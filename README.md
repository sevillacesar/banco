# Spring Boot application for banco

> RestControllers

> Dao Layer as JPA

> PostgreSQL As Database

---

## Table of Contents


- [Installation](#installation)
- [Features](#features)
- [Usage](#usage)
- [Documentation](#documentation)


---

## Example

```java
// code away!

package com.sevilla.minegocio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BancoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BancoApplication.class, args);
	}

}


```

---

## Installation

- Just Clone this repo
- Run mvn clean install

### Clone

- Clone this repo to your local machine using: `https://github.com/sevillacesar/banco`

### Setup

- Run mvn spring-boot:run

## Features

- Consulta por codigo de cliente
- Consulta por codigo de empleado
- Validacion de formato del codigo


## Usage

- You can use Postman 
- Use the Angular application


Para probar la consulta de cliente
```

curl --location 'http://localhost:8080/cliente/001384529' \
--header 'Content-Type: application/json'


```

Para probar la consulta de empleado

```

curl --location 'http://localhost:8080/empleado/008283819' \
--header 'Content-Type: application/json'

```

## Documentation

- This Readme
- scripts.sql
- Prueba técnica banco internacional.docx





