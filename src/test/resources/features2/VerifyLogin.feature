Feature:  user should de able to log in

  Scenario Outline: verify user login with valid credentials
    Given  user on the login page  http://qa3.trycloud.net/index.php/login?clear=1
    When user enter invalid "<username>" and "<password>"
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | user7    | Userpass123 |
      | user34   | Userpass123 |
      | user99   | Userpass123 |

