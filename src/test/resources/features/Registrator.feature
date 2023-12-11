Feature: Create New User

  Scenario Outline: Registration a new user on webpage
    Given User has the correct "<url>"
    Given User is using "edge" as "<browser>"
    When User is on the registration page
    And User enter "<First Name>" and "<Last Name>"
    And User enter email "<Email>" and "<Email>"
    And User fill in "<Mobile phone>"
    And User selects "<gender>"
    And User enters "<nationality>" and "<country of birth>"
    And User enter emergency contact details "<full name>" and "<relationship>" and "<phone number>"
    And User fills in address "<address line 1>" and "<town/city>" and "<post code>" and "<country>" and "<country 2>"
    And User sets "<password>" and "<retype password>"
    And User fills in all anonymous information "<ethnicity>" and "<sexual orientation>" and "<religion>"
    And "<Account confirmation>" is checked
    And "<Code of ethics and conduct>" are checked
    And "<Join and proceed>" are clicked
    Then An "<Account>" is created
    Examples:
      | url                                                       | browser | First Name | Last Name | Email                      | Mobile phone | gender | nationality | country of birth | full name | relationship | phone number | address line 1                                 | town/city   | post code | country       | country 2 | password          | retype password   | ethnicity         | sexual orientation | religion         | Account confirmation |Code of ethics and conduct|Join and proceed |Account|
      | https://membership.basketballengland.co.uk/NewFullAccount | edge    | Robert     | Lucas     | robert.lucaas.80@gmail.com | +46702064151 | female | Swedish     | Sweden           | Anna      | wife         | +46768778384 | 31 The Square, Tarland, Aberdeenshire Scotland | Aberchirder | AB34 4TX  | Aberdeenshire | Sweden    | EttEnkeltLösenord | EttEnkeltLösenord | prefer not to say | prefer not to say  |prefer not to say | prefer not to say    |                          |                 |       |
      |                                                           | chrome  |            |           |                            |              | male   |             |                  |           |              |              |                                                |             |           |               |           |                   |                   |                   |                    |                  |                      |                          |                 |       |


  #Scenario: Create new user last name is missing
    #Given User have correct url
    #When User fails to fill in all member details
    #Then An account is NOT created

  #Scenario: Create new user password doesn't match
    #Given User have correct url
    #And User fill in all member details
    #And User fill in all emergency contact details
    #And User fill in address
    #When User sets password mismatch
    #Then An account is NOT created

  #Scenario: Create new user terms and conditions is not checked
    #Given User have correct url
    #And User fill in all member details
    #And User fill in all emergency contact details
    #And User fill in address
    #And User sets password
    #And User fills in all anonymous information
    #And Account confirmation is checked
    #When Code of ethics and conduct NOT are checked
    #Then An account is NOT created

  #Verifiering skall ske på varje scenario med minst en Junit assert

  #Testfallen skall köras på minst två browsrar

  #Explicit wait, provat massas men får inte & funka :(