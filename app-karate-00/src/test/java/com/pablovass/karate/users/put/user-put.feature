Feature: PUT user on regres

  Scenario: PUT a user
    Given url  "https://reqres.in"+ "/api/users/" + "2"
    And request {"name": "pablo vass2", "job":  "developer"}
    When method PUT
    Then status 200
    And match $.name == 'pablo vass'

