Feature: Add to Cart functionality

  Background:
    When Navigate to etsy
    Then verify that main page has successfully been opened

  Scenario Outline: Search names
    And User sends value in the main page
      | searchBox | <enteredValue> |

    And User select first of the displayed items

    And Click on element on main Page
      | addToCart |

    Then verify that item has been added to the cart successfully

    Examples:
      | enteredValue |
      | Stickers     |
