Feature: Post user on regres

  Scenario: Post a user
    Given url  'https://reqres.in/api/users'
    When method POST
    Then status 200
