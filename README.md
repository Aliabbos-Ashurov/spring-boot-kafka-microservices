# Spring Cloud Gateway Microservices

The goal of this project is to implement an API gateway in a microservices project. This repository serves as a basic
example of a gateway with YAML file configurations.

## Features

### 1. Kafka

- Message broker facilitating communication between the user and the notification service.

### 2. API Gateway

- Implements a gateway for routing requests to various microservices.
- Configurable via YAML files for flexible routing and filtering.

### 3. Eureka Discovery Server

- Centralized service registry for dynamic service registration and discovery.
- Enables load balancing and fault tolerance.

### 4. Spring Cloud Config

- Centralized configuration management for microservices.
- Allows dynamic configuration updates.

- **Spring Boot** for building microservices.
- **Spring Cloud** for service discovery, gateway ,configuration, and Feign integration.
- **Kafka** message broker
- **Docker** for containerization.

## Getting Started

To get started with this project, clone the repository and follow the instructions in the respective service directories
to set up and run the services.
