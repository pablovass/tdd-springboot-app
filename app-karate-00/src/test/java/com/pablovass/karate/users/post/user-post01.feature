Feature: Post user on regres page

  Background:
    * url "https://reqres.in"
    * path "/api/users"
  #* request {"name": "pablo vass", "job":  "developer"}
    * def var = {"name": "pablo vass", "job":  "developer"}
    * request {"name": "#()", "job":  "#(job)"} //setear varios ejemplos

  Scenario: Post a user
    Given request var
    When method POST
    Then status 201

  Scenario Outline: Post three users
    When method POST
    Then status 201
    Examples:
      | name   | job     |
      | juan   | leader  |
      | carlos | dev     |
      | sofia  | backend |


  Scenario: Post a user without job
    Given url  "https://reqres.in/" + "/api/users"
    And request {"name": "matias"}
    When method POST
    Then status 201

  Scenario: Post a user with name invalid
    Given url  'https://reqres.in/api/users'
    And request {"name": "##/)(/)", "job":  "developer"}
    When method POST
    Then status 201

  Scenario: Post a user without name
    Given url  'https://reqres.in/api/users'
    And request {"job":  "developer"}
    When method POST
    Then status 201
