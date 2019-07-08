Feature: Form automation
  To shop and to buy clothes

  Scenario: Form submit
    Given user navigates to the app url
    When user navigate to Woman
    And user click on product
    And adds to cart
    And clicks checkout from the product popup
    And clicks checkout from order page
    And creats new account
    And fills out Personal Information and clicks continue
    And fills out Address and clicks continue
    And agrees to terms
    And fills out invoice and clicks continue
    And pays by check
    And clicks order
    Then the order is submitted