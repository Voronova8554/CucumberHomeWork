Feature:  user should be accessing all the main modules of the app

  @wip
  Scenario:  Verify users accessing all the main modules of the app
    Given  user on the login page  "http://qa3.trycloud.net/index.php/login?clear=1"
    When the users  log in with valid credentials
    Then Verify the user see the following modules:
      | Dashboard |
      | Files     |
      | Photos    |
      | Activity  |
      | Talk      |
      | Mail      |
      | Contacts  |
      | Circles   |
      | Calendar  |
      | Deck      |