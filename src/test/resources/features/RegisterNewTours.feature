@tag
Feature: Register NewTours
  As a web user
  I want to use the new tours home page 
  to do the register in the page for do the loggin in the page

  @Register
  Scenario: Register in the newtours page
    Given that esteban is in the register page
    When esteban does the register
      | FirtsName | LastName | Phone | Email            | Adress | City     | State     | PostalCode | Country  | UserName    | Password | ConfirmPassword |
      | Esteban   | Lopez    |   123 | ju.a@hotmail.com | cr39   | Medellin | Antioquia |       5005 | Colombia | esteban2020 |    12345 |           12345 |
    Then esteban will be in the successful page
