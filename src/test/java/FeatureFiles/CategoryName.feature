Feature: Category name test

Background:
  When Navigate to etsy
  Then verify that main page has successfully been opened

  Scenario: Category name
    Given Navigate to Clothing & Shoes section
    And Navigate to Men's shirts sections
    Then verify that at least twenty of displayed items description contains the word "shirt"
