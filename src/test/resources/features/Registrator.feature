Feature: Create New User

  Scenario Outline: Registrate a new user on webpage
    Given User have correct <url>
    And User fill in all member details
    And User fill in all emergency contact details
    And User fill in address
    And User sets password
    And User fills in all anonymous information
    And Account confirmation is checked
    And Code of ethics and conduct are checked
    And Join and proceed are clicked
    Then An account is created
    Examples:
      |  |  |  |

  Scenario: Create new user last name is missing
    Given User have correct url
    When User fails to fill in all member details
    Then An account is NOT created

  Scenario: Create new user password doesn't match
    Given User have correct url
    And User fill in all member details
    And User fill in all emergency contact details
    And User fill in address
    When User sets password mismatch
    Then An account is NOT created

  Scenario: Create new user terms and conditions is not checked
    Given User have correct url
    And User fill in all member details
    And User fill in all emergency contact details
    And User fill in address
    And User sets password
    And User fills in all anonymous information
    And Account confirmation is checked
    When Code of ethics and conduct NOT are checked
    Then An account is NOT created

  #Verifiering skall ske på varje scenario med minst en Junit assert

  #Testfallen skall skapas genom en och enbart en Scenario Outline ifrån en feature-fil

  #Testfallen skall köras på minst två browsrar

  #Explicit wait, provat massas men får inte & funka :(