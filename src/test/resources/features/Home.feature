@web
Feature: MainPage Feature

  Background:
    Given I am on DarkSky Home Page

  @home
  Scenario: Verify minimum and maximum temperature
    When I click on today button on home page
    And  I get temperatures on home page
    And I get minimum temperatures on home page
    And I get maximum temperatures on home page
    Then I verify minimum temperature on home page
    Then I verify maximum temperature on home page
