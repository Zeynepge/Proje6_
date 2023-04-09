package StepDefinitions;

import Pages.DiologCountent;
import Pages.LeftNaw;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginSteps {

        LeftNaw ln=new LeftNaw();
        DiologCountent dc=new DiologCountent();


        @And("Enter LogOut")
        public void enterLogOut() {
            ln.clickFunction(ln.logOutButton);
        }
        @Then("The username and password could not be verified message is displayed")
        public void theUsernameAndPasswordCouldNotBeVerifiedMessageIsDisplayed() {
            dc.veritfyContainsTextFunction(dc.errorText,"not be verified");
        }

        @When("Enter username as {string} password as {string} and click login button")
        public void enterUsernameAsPasswordAsAndClickLoginButton(String username, String password) {
            ln.sendKeysFunction(ln.username, username);
            ln.sendKeysFunction(ln.password,password);
            ln.clickFunction(ln.loginButton);
        }
         @Then("Success message as {string}  should be displayed")
         public void successMessageAsShouldBeDisplayed(String firstName) {
        ln.veritfyContainsTextFunction(ln.accountSuccessText,firstName);
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        ln.veritfyContainsTextFunction(ln.accountSuccessText,"zeynep");

    }
}