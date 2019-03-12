Feature: InSprint Testing

  Background: set property
    Given driver path

  Scenario Outline: validating cognizant home page
   Given a User
   When hit the cognizant bank url
   Then cognizant bank home page should get open
   And clicks on new account
   Then new account page should be displayed
   
   Examples:
   
   |TestNo|
   |1|
   |2|
     