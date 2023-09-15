@Login
Feature: Verify Login page elements are present

  Scenario: Enter Login credentials

    Given   User enters username "standard_user" and password "secret_sauce"

    And     User clicks login button

    Then    User selects the product "bolt-t-shirt" to add to the cart

    Then    User selects another product "fleece-jacket" to add to the cart

    Then    User removes the product "bolt-t-shirt"

    And     User verify the products under the cart

    Then    User clicks on checkout button

    And     User enters fName "Tester" lName "123" and postalCode "75040"

    Then    User clicks on continue button

    Then    User clicks on finish button

    And     Click on menu button and logout











#  Scenario: Filtering products
#    Given  User enters username "standard_user" and password "secret_sauce"
#    Then   User clicks login button
##    And    User selects filter option
#    And    User selects the product "Sauce Labs Backpack" to add to the cart

