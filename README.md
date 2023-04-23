# [Crypto Post](https://cryptopost.global/main)

This repository contains the back-end for the Crypto Post web application, which allows users to buy postage labels using cryptocurrency. The front-end for the project is hosted on a private Bitbucket server and is written in AngularJS.

## Features

- Generate postage labels using the Easypost API
- Accept cryptocurrency payments using NowPayments
- Use Strapi CMS for input fields and blog posts, making it easier to update the website without the need for a release
- Utilize GraphQL for API calls

## Requirements

- Java 17 or later
- Spring Boot
- Strapi CMS
- Easypost API Key
- NowPayments API Key

## Getting Started

* Have docker installed on your system (should be bundled with docker compose) the best way to do this is get it directly from the docker website
* Download the following `docker-compose.yml` file:

```
version: '3.5'

services:
  postgres:
    image: postgres:12.2-alpine
    ports:
      - "5433:5432"
    environment:
      POSTGRES_USER: crypto_shipping
      POSTGRES_PASSWORD: crypto_shipping
      POSTGRES_DB: crypto_shipping
```
* With docker running, go to the file location of the previously downloaded yml and run `docker-compose up -d` (for some operating systems this might be `docker compose up -d`)
* From IntelliJ, click on Edit configurations and add a new environment variable `DB_PORT` the value should be the first part of the ports section from the docker-compose yml file, so for the file above it is `5433`. Click ok, then apply then ok
* the Java version needs to be changed in two places. 
  * In Project Structure -> Project Settings -> Project make sure SDK is set to version 18.0.1
  * In Preferences -> Build, Execution, Deployment -> Build Tools -> Gradle change the Gradle JVM setting to 18.0.1 also
* Finally, on the right hand side of the IDE click Gradle -> Tasks -> dgs graphql codegen and run generateJava

Project should now run!

This project is licensed under the [MIT License](LICENSE).

