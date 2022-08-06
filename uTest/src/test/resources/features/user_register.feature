
@stories
Feature: user register
    as a user, i want to fill out data form to register as a user of uTest

  @scenario:
  Scenario Outline: user register
    Given that <firstName> is on uTest page

    When she fills out her personal information
      | firstName  | lastName    |email  | birthMonth   | birthDay   | birthYear  |
      | <firstName> | <lastName> |<email>| <birthMonth> | <birthDay> | <birthYear> |

    And she enters her address data
      | city   | postalCode   | country   |password  |
      | <city> | <postalCode> | <country> |<password>|


    Then she should be registered on the page

    Examples:
      | firstName | lastName | birthMonth | birthDay | birthYear | city     | postalCode | country  | password  |email                     |
      | Leidy     | Moreno   | February   | 17       | 1989      | Medellin | 050022     | Colombia | Moreno53+ |lady_johana101@hotmail.com|
