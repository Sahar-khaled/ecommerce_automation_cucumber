package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P01_register;


public class D01_registerStepDef extends P01_register {

    @Given("user link ecommerce page")
    public void goRegisterPage() {
        register_link().click();
    }

    @And("user enter email {string} field")
    public void user_enter_email_field(String email) {
        enter_email(email);

    }

    @And("user clicks on create account button")
    public void user_clicks_on_register_button() {
        enter_register().click();
    }


    @And("your Personal Information,Address and Contact info.")
    public void your_personal_information_address_and_contact_info() {
        enter_valid_data();

    }

    @And("Click on Register button.")
    public void click_on_register_button() {
        click_register();

    }

    @Then("Validate that user is created.")
    public void validate_that_user_is_created() {
        validate_that_user_is_created_successfully();

    }
}
