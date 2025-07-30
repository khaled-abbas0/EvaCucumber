Feature: Eva Pharma Assessment Test

  Scenario: Check that the number of records changes when adding and deleting admin users
    Given I login as an Admin with username and password
    Then verify that user is logged
    And I navigate to the Admin page
    When I get the current number of admin records
    And I press add button
    And I add a new admin user
    Then the number of records should increase by 1
    When I search for the admin user and delete the new user
    Then the number of records should decrease by 1