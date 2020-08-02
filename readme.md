# Eureka Registry Service `ERS`

## Overview

Application uses [Netfilx's Eureka](https://github.com/Netflix/eureka/wiki) to manage microservices ecosystem.

- `ERS` handle registration of services within a microservice environment.
- `ERS` handle deregistration of services within a microservice environment.
- `ERS` handle periodic services status report - `healthchecks`.
- `ERS` handle services that no longer are available (no longer send healthcheck).
- `ERS` provide access to application registry to microservice within system.
- `ERS` handle network failures.
- `ERS` provide dashboard - visual representation of microservice environment state.

## Stack

1. Core framework
    - [Spring Boot](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)
1. Dependency management
    - [Maven](https://maven.apache.org/guides/index.html)
1. Used libraries
    - [Netfilx's Eureka Server for Spring Boot](https://github.com/Netflix/eureka/wiki)

## Compile

Project is build using maven (proper [profile](#profiles) is advisable).

```bash
mvn clean package -Dspring.profiles.active=prod
```

## Run

Application can be compiled and run by maven spring boot plugin from `ers-module`.

```bash
cd ers-service
mvn spring-boot:run
```

Issue has been opened to enable spring plugin on paren pom [github link](https://github.com/cafetamine/EurekaRegistryService/issues/9).

## Profiles

1. `info` - included in other profiles:
    - provides basic information abot application (title, version).
    - ensures proper logging of application banner.
1. `dev` - for local development environment:
    - logging to console only.
    - configuration for "localhost".
1. `prod` - for production/deployed environment:
    - logging to file only.
    - configuration for "localhost".
