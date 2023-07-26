#Author: your.email@your.domain.com
#Date: july.25,2023
#Description: This Feature is to create the new client's Account.
#keywords: name, address, email, password.
Feature: Create the new account for the client.

  Scenario: Creating the new account successful with the client credentials
    Given the user is on the client creation page
     When the user enter name, address, email and password in the form
      And the user clicks on the Register button
     Then the user will nevigate to the home page
