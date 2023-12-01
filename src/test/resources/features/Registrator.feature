Feature: Registrator

  Scenario: Registrate user on webpage
    Given I have correct url
    When I fill in all required fields
    And Click on registrate button
    Then An account is created