Feature: Payments scenarios
  Scenario: Test List of payments response
    Given url 'https://run.mocky.io/v3/5c107a0b-bdb9-468f-8ad7-8b70a6fc89d6'
    When method GET
    Then status 200
    And match each $ contains {id :  '#notnull'}