@Search-Cars
Feature: Acceptance testing to validate search cars page is working
  in order to validate that
  the search cars page is working fine
  we will do acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given Iam on the Home page "https://www.carsguide.com.au/" of carsguide website
    When I move to menu
      | Menu    |
      | buysell |
      | reviews |
    And click on "search cars"link
    And select carbrand as"BMW" from AnyMake Dropdown
    And select carmodel as"1 Series" from AnyModel Dropdown
    And select carlocation as"NSW - Central Coast" from AnyLocation Dropdown
    And select carprice as"$60,000" from Price Dropdown
    Then I will click on Find_My_Next_Car button
    Then I should see list of searched cars
    And page title should be "Bmw 1 Series Under 60000 for Sale Central Coast NSW | carsguide"
