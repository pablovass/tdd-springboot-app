Feature: Delete user on regres

  Scenario: Delete a user
    Given url  "https://reqres.in"+ "/api/users/" + "2"
    When method DELETE
    Then status 204

