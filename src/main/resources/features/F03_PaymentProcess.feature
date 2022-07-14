@smoke
Feature: F03_PaymentProcess | Automate payment Process steps
Scenario: Select “Blouses” Subcategory in “Women” Category and order the product

  Given user link ecommerce page
  When user enter mail "test@ex.com" field
  And enter password "120MAN"
  And Click on signIn button.
  And Validate that user login successfully.
  When Move your cursor over Women's link and Click on sub category
  Then Get product name and Validate that same product is displayed on searched page with same details
  And click on more button
  And Increase quantity
  And Select size
  And Select color.
  And Click Add to Cart button.
  And Click Proceed to checkout button
  And Click on by bank wire
  Then Confirm the order and Make sure that Product is ordered.