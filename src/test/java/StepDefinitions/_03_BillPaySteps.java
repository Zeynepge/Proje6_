package StepDefinitions;

import Pages.DiologCountent;
import Pages.LeftNaw;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _03_BillPaySteps {

    LeftNaw ln=new LeftNaw();
    DiologCountent dc=new DiologCountent();
    @When("Click Bill Pay")
    public void clickBillPay() {
        ln.clickFunction(ln.billPay);
    }
    @And("Click Send payment")
    public void clickSendPayment() {
        dc.clickFunction(dc.sendPaymet);
    }
    @Then("Enter payeeName as {string} Adress as {string} City as {string}")
    public void enterPayeeNameAsAdressAsCityAs(String payeeName, String Adress, String City) {
        dc.sendKeysFunction(dc.payeeNAme,payeeName);
        dc.sendKeysFunction(dc.adressStreet,Adress);
        dc.sendKeysFunction(dc.adressCity,City);
    }
    @And("Enter state as {string} Zipcode as {string} phone as {string}")
    public void enterStateAsZipcodeAsPhoneAs(String state, String Zipcode, String phone) {
        dc.sendKeysFunction(dc.adressState,state);
        dc.sendKeysFunction(dc.adressZipCode,Zipcode);
        dc.sendKeysFunction(dc.phoneNumber,phone);
    }
    @And("Enter account as {string} v_account as {string} amount as {string}")
    public void enterAccountAsV_accountAsAmountAs(String account, String v_account, String amount) {
        dc.sendKeysFunction(dc.accountNumber,account);
        dc.sendKeysFunction(dc.verifyAccount,v_account);
        dc.sendKeysFunction(dc.amount,amount);
    }

    @Then("Completed message as {string} should be displayed")
    public void completedMessageAsShouldBeDisplayed(String amount) {
        dc.veritfyContainsTextFunction(dc.successMessage,amount);
    }
}