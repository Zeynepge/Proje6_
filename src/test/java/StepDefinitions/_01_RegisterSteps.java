package StepDefinitions;

import Pages.DiologCountent;
import Pages.LeftNaw;

import Utlity.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_RegisterSteps {
    LeftNaw ln=new LeftNaw();
    DiologCountent dc=new DiologCountent();
    @Given("Navigate to ParaBank")
    public void navigateToParaBank() {

        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm ");
        //GWD.getDriver().manage().window().maximize();
    }
    @When("Click register")
    public void clickRegister() {
        ln.clickFunction(ln.register);
    }
    @Then("Create account")
    public void createAccount() {
        dc.sendKeysFunction(dc.firstName,"ayse");
        dc.sendKeysFunction(dc.lastName,"karaman");
        dc.sendKeysFunction(dc.Address,"köprübasi");
        dc.sendKeysFunction(dc.city,"Rodgau");
        dc.sendKeysFunction(dc.state,"Germany");
        dc.sendKeysFunction(dc.zipCode,"25300");
        dc.sendKeysFunction(dc.Phone,"5441233212");
        dc.sendKeysFunction(dc.SSN,"23456");
        dc.sendKeysFunction(dc.username,"akaraman");
        dc.sendKeysFunction(dc.password,"123456");
        dc.sendKeysFunction(dc.confirm,"123456");
        dc.clickFunction(dc.registerButton);
    }

    @And("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dc.veritfyContainsTextFunction(dc.successText,"akaraman");
    }
}