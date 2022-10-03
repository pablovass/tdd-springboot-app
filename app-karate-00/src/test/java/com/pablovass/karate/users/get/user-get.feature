Feature: Get user on regres

  Scenario: Get a user
    Given url  'https://reqres.in/api/users/2'
    When method GET
    Then status 200

  Scenario: Get list of users by page.
    Given url  'https://reqres.in/api/users?page=2'
    When method GET
    Then status 200
    And match
