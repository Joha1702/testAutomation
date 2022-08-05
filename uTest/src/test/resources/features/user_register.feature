
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
      | city   | postalCode   | country    |
      | <city> | <postalCode> | <country> |

    And she enters her devices information
      | computer   | version   | language   | mobileDeviceBrand   | model   | operatingSystem   |
      | <computer> | <version> | <language> | <mobileDeviceBrand> | <model> | <operatingSystem> |

    And she enters a secure password
      | password   |
      | <password> |

    Then she should be registered on the page

    Examples:
      | firstName | lastName | birthMonth | birthDay | birthYear | city     | postalCode | country  | computer | version | language | mobileDeviceBrand | model | operatingSystem | password  |email                     |
      | Leidy     | Moreno   | February   | 17       | 1989      | Medellin | 050022     | Colombia | Windows  | 10      | spanish  | Lenovo            | S880  | Android 4.0.4   | Moreno53+ |lady_johana101@hotmail.com|
