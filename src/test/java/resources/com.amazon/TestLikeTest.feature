Feature: Tests for KinCarta
  Scenario: Test Amazon Search And Select third Item
    Given the user navigates to amazon web page
    When  the user types "Alexa" in search box
    And   the user click on search button
    And   press on Second Page Button
    And   The User Click Third Item on List
    Then  User Verify If item "Added to Cart" and would be available for purchase

