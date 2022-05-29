@test
Feature: Test The functionality of date and time

  @test1
  Scenario: verify the functionality of change date
    Given API demos app is open
    When press on Views
    And press on Date Widgets
    And press on Dialog
    And press on Change the Date
    And Change the Date
    Then Verify the changed date

  @test2
  Scenario: verify the functionality of change time
    When Click on Change the Time
    And Change the Time
    Then Verify the changed time
