@dad
Feature: check the functionality of enter text

  @dad1
  Scenario Outline: verify the functionality of enter text key event text
    Given user click on api demos app
    And click on text
    And click on key event text
    And enter any key "<key>"
    Then click on clear

    Examples: 
      | key |
      | h   |
