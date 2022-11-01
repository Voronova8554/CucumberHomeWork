Feature: Etsy search functionality
  User story: As a user, when I am on the Etsy search page
  I should be able to search whatever I want and see relevant information

  @wip
  Scenario: Etsy Title Verification
    Given user on etsy home page
    Then user sees title is as expected

    @wip
    Scenario: Etsy Search Functionality Title Verification
      Given user on etsy home page
      When user types Wooden Spoon in the search box
      And user clicks search button
      Then user sees Wooden Spoon is in the title