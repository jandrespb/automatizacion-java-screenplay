Feature: Login on web page on swag labs

  Scenario Outline: Login validate credentials
    Given User navigate on page swag labs
    When User put credentials
      | username   | password   |
      | <username> | <password> |
    Then User looking home page
    Examples:
      | username      | password     |
      | standard_user | secret_sauce |



