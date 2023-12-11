Feature: Create New User

  Scenario Outline: Registration a new user on webpage
    #Given User is using "edge" as "<browser>"
    Given User is on the correct "<url>"
    And User enter "<DateOfBirth>" "<First Name>" and "<Last Name>"
    And User enter email "<Email>" and "<confirmEmail>"
    And User fill in "<Mobilephone>"
    And User selects "<gender>"
    And User enters "<nationality>" and "<country of birth>"
    And User enter emergency contact details "<full name>" and "<relationship>" and "<phonenumber>"
    And User fills in address "<address line 1>" and "<towncity>" and "<post code>" and "<county>" and "<country>"
    And User sets "<password>" and "<retypepassword>"
    And User fills in all anonymous information "<ethnicity>" and "<sexual orientation>" and "<religion>"
    And "<Account confirmation>" is clicked
    And "<Code of ethics and conduct>" are clicked
    And "<Join and proceed>" are clicked
    Then An "<Account>" is created
    Examples:
     |browser | url                                                       | DateOfBirth | First Name | Last Name | Email                      | confirmEmail               |Mobilephone | gender | nationality | country of birth | full name | relationship | phonenumber | address line 1                                 | towncity   | post code | county        | country   | password          | retypepassword   | ethnicity         | sexual orientation | religion         | Account confirmation |Code of ethics and conduct|Join and proceed |Account|
     |edge    | https://membership.basketballengland.co.uk/NewFullAccount | 12/02/1980  | Robert     | Lucas     | robert.lucaas.80@gmail.com | robert.lucaas.80@gmail.com |+46702064151|  male  |   Swedish   | Sweden           | Anna      | wife         | +46768778384| 31 The Square, Tarland, Aberdeenshire Scotland | Aberchirder| AB34 4TX  | Aberdeenshire | Sweden    | EttEnkeltLösenord | EttEnkeltLösenord| prefer not to say | prefer not to say  |prefer not to say | clicked              |clicked                   |clicked          |  yes  |
     |chrome  |                                                           |             |            |           |                            |                            |            |        |             |                  |           |              |             |                                                |            |           |               |           |                   |                  |                   |                    |                  |                      |                          |                 |       |

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