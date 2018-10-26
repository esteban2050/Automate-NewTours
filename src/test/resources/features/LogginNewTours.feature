@tag
Feature: Loggeo NewTours
  As a web user
  I want to use the new tours home page 
  to make the loggin in the page for a reserve

  @Login
  Scenario: Loggin with username and password in the login page
    Given that Esteban is in the loggin page of New Tours
    When Esteban entry with a user and password
      | username            | password |
      | manco.5@hotmail.com | sophos   |
    Then Esteban will be in the welcome page
