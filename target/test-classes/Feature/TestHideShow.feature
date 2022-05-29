@tag
Feature: Hide and Show functionality

  @tag1
  Scenario: verify the hide functionality
    Given user is on api demos app
    When click on api demos app
    And click on Animation
    And click on hide-show animation
    And click on zero,one two,three
    Then check the buttons are hide

  @tag2
  Scenario: show functionality after hiding
    Given user is on api demos app
    When click on api demos app
    And click on Animation
    And click on hide-show animation
    And click on zero,one two,three
    Then click on show button
    Then check hide buttons are shown now
