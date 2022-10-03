Feature: Reusable scenario for post a user

@Create
  Scenario:
    Given url 'https://reqres.in/api/users'
    And request {"name": "matias","job": "leader"}
    When method POST
    Then status 201
    And def contactId = $.id
