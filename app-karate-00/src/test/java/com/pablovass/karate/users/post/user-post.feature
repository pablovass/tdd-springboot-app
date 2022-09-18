Feature: Post user on regres

  Scenario: Post a user
    Given url  'https://reqres.in/api/users'
    And request {"name": "pablo vass", "job":  "developer"}
    When method POST
    Then status 201

