package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;

public class D02_loginStepDef extends P02_login {


    @When("user enter mail {string} field")
    public void enter_mail(String mail) {
        enter_your_mail(mail);
    }

    @When("enter password {string}")
    public void enter_password(String pass) {
      enter_your_pass(pass);
    }
    @When("Click on signIn button.")
    public void click_on_sign_in_button() {
       click_signIn();
    }
    @Then("Validate that user login successfully.")
    public void validate_that_user_login_successfully() {
          validate_login();
    }

}
