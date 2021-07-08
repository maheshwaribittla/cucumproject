@Used-Cars-Search
Feature: Acceptance testing to validate used car search page is working
  in order to validate that
  the used car search page is working fine
  we will do acceptance testing

  @used-Search-Cars-Positive
  Scenario: Validate used Search cars Page
    Given I am on the Home page "https://www.carsguide.com.au/" of carsGuide website
    When I move to menu
      | Menu    |
      | buysell |
      | reviews |
    And click on "Used" cars from used cars page
    And select carbrand as "Audi" from AnyMake Dropdown
    And select carmodel as "A4" from AnyModel Dropdown
    And select carlocation as "NSW - Central West" from AnyLocation Dropdown
    And select carprice as "$20,000" from Price Dropdown
    Then I will click on Find_My_Next_Car button
    Then i should see list of searched cars
    And page title should be "Used Audi A4 Under 20000 for Sale Central West NSW | carsguide"
