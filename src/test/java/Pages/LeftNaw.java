package Pages;

import Utlity.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LeftNaw extends Parent {

    public LeftNaw() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement register;

    @FindBy(xpath = "//*[@name='username']")
    public WebElement username;

    @FindBy(xpath = "//*[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//*[@value='Log In']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[@class='smallText']")
    public WebElement accountSuccessText;

    @FindBy(linkText = "Log Out")
    public WebElement logOutButton;

    @FindBy(xpath = "//a[text()='Bill Pay']")
    public WebElement billPay;




}