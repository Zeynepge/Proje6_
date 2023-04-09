package Pages;

import Utlity.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DiologCountent extends Parent{

    public DiologCountent() {
        PageFactory.initElements(GWD.getDriver(),this);
    }

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement Address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement Phone;

    @FindBy(id = "customer.ssn")
    public WebElement SSN;

    @FindBy(id = "customer.username")
    public WebElement username;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "//*[@value='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "//div[@id='rightPanel']//h1")
    public WebElement successText;

    @FindBy(css = "[class='error']")
    public WebElement errorText;

    @FindBy(xpath = "//p[@class='smallText']")
    public WebElement successTextLogin;

    @FindBy(xpath = "//input[@name='payee.name']")
    public WebElement payeeNAme;

    @FindBy(xpath = "//input[@name='payee.address.street']")
    public WebElement adressStreet;

    @FindBy(xpath = "//input[@name='payee.address.city']")
    public WebElement adressCity;

    @FindBy(xpath = "//input[@name='payee.address.state']")
    public WebElement adressState;

    @FindBy(xpath = "//input[@name='payee.address.zipCode']")
    public WebElement adressZipCode;

    @FindBy(xpath = "//input[@name='payee.phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//input[@name='payee.accountNumber']")
    public WebElement accountNumber;

    @FindBy(xpath = "//input[@name='verifyAccount']")
    public WebElement verifyAccount;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FindBy(xpath = "//input[@value='Send Payment']")
    public WebElement sendPaymet;

    @FindBy(xpath = "(//div[@ng-show='showResult']//p)[1]")
    public WebElement successMessage;



}
