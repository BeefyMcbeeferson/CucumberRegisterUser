Feature: Registrate New User

  Scenario: Registrate user on webpage
    Given I have correct url
    When I fill in all required fields
    Then An account is created

Feature: Registrate New User

  Scenario Outline: Registrate user on webpage
    Given I have correct <url>
    When I fill in all <required> fields
    Then An account is <created>
    Examples:

      | url                                                       | required | created |
      | https://membership.basketballengland.co.uk/NewFullAccount |          |         |