@New-Cars-Search
Feature: Acceptance testing to validate new search cars page is working
  in order to validate that
  the new search cars page is working fine
  we will do acceptance testing

  @New-Search-Cars-Positive
  Scenario: Validate new Search cars Page
    Given I am on the Home page "https://www.carsguide.com.au/" of carsGuide website
    When I move to menu
      | Menu    |
      | buysell |
      | reviews |
    And click on "New" cars from submenu
    And select carbrand as "Jeep" from AnyMake Dropdown
    And select carmodel as "Compass" from AnyModel Dropdown
    And select carlocation as "NT - South" from AnyLocation Dropdown
    And select carprice as "$10,000" from Price Dropdown
    Then I will click on Find_My_Next_Car button
    Then i should see list of searched cars
    And page title should be "New Jeep Compass Under 10000 for Sale South NT | carsguide"
