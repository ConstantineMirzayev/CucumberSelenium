# 1 Writing feature keyword with description (class name)
Feature: Tests for KinCarta

  # 2 Writing scenario keyword with description (Our test case)
  # Gherkin language has 3 main keywords for Steps:
  # Given - For precondition
  # When  - For Action
  # Then  - For Validation
  # Also keywords for steps are: And, But -> Will continue previous step, * -> it is just any step
  Scenario: Test Amazon Search And Select third Item
    Given the user navigates to amazon web page
    When  the user types "Alexa" in search box
    And   the user click on search button
    And   press on Second Page Button
    And   The User Click Third Item on List
    Then  User Verify If item would be available for purchase

