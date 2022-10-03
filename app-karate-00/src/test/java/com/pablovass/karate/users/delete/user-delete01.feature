Feature: Delete user on regres page

  Scenario: Delete a user
    * call read("../post/user-post-snippest.feature@Create")
    Given url  "https://reqres.in"+ "/api/users/" + contactId
    When method DELETE
    Then status 204

