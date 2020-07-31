# Getting Started

### Introduction
iCustomer service expose APIs (HATEOAS) for read/save resources such as Customer. Swagger-ui is rendered at runtime to make it easier to call APIs.


### Guides
Building jar file by maven
```sh
$ mvn clean install
```
Starting iCustomer instance with "dev" profile with initialization of sample data.
```sh
$ cd target
...
$ java -jar icom-customer-{version}.jar --spring.profiles.active=dev
```
Access swagger by http://localhost:8002/swagger-ui.html

### Noted CURL
