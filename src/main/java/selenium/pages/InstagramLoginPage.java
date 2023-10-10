package selenium.pages;

import helper.ElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.driverFactory.Driver;

public class InstagramLoginPage extends BasePage{

    public InstagramLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//input[@aria-label='Phone number, username, or email']")
    public WebElement phoneNumUserNameOrEmail;

    @FindBy(xpath = "//input[@aria-label='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[@type='submit']/..")
    public WebElement loginBtn;

    @FindBy(xpath = "")
    public WebElement forgetPassword;

    public InstagramLoginPage login(String phone, String pass) {
       elementActions.writeText(phoneNumUserNameOrEmail,phone)
               .writeText(password,pass)
               .clickTheButton(loginBtn);
       return this;
    }

    public InstagramLoginPage forgetPasswordFunc() {
        elementActions.clickTheButton(forgetPassword);
        return this;
    }
}
