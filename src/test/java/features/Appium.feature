Feature: Login to Mobile App

  Scenario: Successful Login
    Given I am on the Login screen
    When I enter username "test_user" and password "test_password"
    And I tap the Login button
    Then I should see the Home screen

  Scenario: Login with Invalid Credentials
    Given I am on the Login screen
    When I enter username "invalid_user" and password "invalid_password"
    And I tap the Login button
    Then I should see an error message
