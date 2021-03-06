# Account API For Existing Customer
___
# Spring Boot Application

This project provides to create account for existing customers.
___
# Summary

The assessment consists of an API to be used for opening a new “current account” of already existing customers.
___
# Requirements

• The API will expose an endpoint which accepts the user information (customerID, initialCredit).

• Once the endpoint is called, a new account will be opened connected to the user whose ID is customerID.

• Also, if initialCredit is not 0, a transaction will be sent to the new account.

• Another Endpoint will output the user information showing Name, Surname, balance, and transactions of the accounts.

___


   The application has 2 apis
  
• AccountAPI

• CustomerAPI

  POST /v1/account - creates a new account for existing customer

  GET /v1/customer/{customerId} - retrieves a customer

# Tech Stack

• Java 11

• Spring Boot

• Spring Data JPA

• Restful API 

• H2 In memory database

• Docker
___
# Prerequisites

• Maven

• Docker
___
#### Docker

Search for 'yabancifurkan/images' from the Docker Hub site.

Download the image with the 'docker pull yabancifurkan/images:account-0.0.2.jar' command,

run it with the 'docker run -t account-0.0.2.jar' command.
___
*$PORT: 8070*

  ```ssh
  $ docker pull yabancifurkan/images:account-0.0.2.jar
   ```
   
  ```ssh
  $ docker run -t images:account-0.0.2.jar
  ```

