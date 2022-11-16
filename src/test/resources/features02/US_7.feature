
Feature: user should be able to remove files from the favorites and upload a file directly

    Background:
    Given user on the dashboard page
    When the user clicks the "Files" module

  Scenario: Verify users can add the folder

    And the user clicks the add icon on the top
    And And user click ”new folder”
    And user write a folder name
    When the user click submit icon
    Then Verify the folder is displayed on the page

  Scenario:  Verify users can upload a file inside a folder

    And user choose a folder from the page
    And the user clicks the add icon on the top
    When users uploads file with the “upload file” option
    Then verify the file is displayed on the page
