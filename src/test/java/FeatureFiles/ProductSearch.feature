Feature: Searching a product functionality

  Background:
    When Navigate to etsy
    Then verify that main page has successfully been opened

  Scenario:
  Given Enter a specific keyword or product name in the search bar
  And Click on the search button
  Then Verify that the search results page displays relevant products matching the search criteria "Necklace"