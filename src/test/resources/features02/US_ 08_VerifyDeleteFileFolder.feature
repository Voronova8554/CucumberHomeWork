Feature: user should be able to delete a file/folder.

  Scenario: Verify users delete a file/folder
    Given user on the dashboard page
    When the user clicks the "Files" module
    When the users click action-icon from any file on the page to remove
    And user choose the -Delete folder- option
    When the user clicks the "Deleted files" sub-module on the left side
    Then Verify the deleted file is displayed on the page.

