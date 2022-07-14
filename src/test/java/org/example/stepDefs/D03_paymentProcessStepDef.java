package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pages.P03_paymentProcess;

public class D03_paymentProcessStepDef extends P03_paymentProcess {


    @And("Move your cursor over Women's link and Click on sub category")
    public void move_your_cursor_over_women_s_link() {
        hover_womens_link();
    }

    @Then("Get product name and Validate that same product is displayed on searched page with same details")
    public void get_name() {
        product_name();

    }
    @And("click on more button")
    public void click_on_more_button() {
        click_more_btn();
    }
    @And("Increase quantity")
    public void increase_quantity() {
        changeQuantity();
    }
    @And("Select size")
    public void select_size() {
        changeSize();
    }
    @And("Select color.")
    public void select_color() {
        chooseColor();
    }
    @And("Click Add to Cart button.")
    public void click_add_to_cart_button() {
        addToCart();

    }

    @And("Click Proceed to checkout button")
    public void click_proceed_to_checkout_button() {
        checkOut();
    }
    @And("Click on by bank wire")
    public void click_on_by_bank_wire() {
        confirn_select_bank_wire();
    }

    @And("Confirm the order and Make sure that Product is ordered.")
    public void confirm_the_order() {
        confirm_order();
    }


}
