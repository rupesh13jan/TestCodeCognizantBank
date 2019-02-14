Feature: check url

  Background: set property
    Given driver path

  Scenario: checking url
    Given "https://www.google.com/"
    And User enters
      | username  | password |
      | chandeesh |      123 |
      | babu      |      123 |
