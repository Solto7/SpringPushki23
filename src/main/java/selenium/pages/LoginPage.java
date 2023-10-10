package selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "userName")
    public WebElement userNameField;

    @FindBy(id = "password")
    public WebElement passwordField;

    @FindBy(id = "login")
    public WebElement loginBtn;

    @FindBy(xpath = "//p[@id='name']")
    public WebElement errorMessage;

    public LoginPage enterUserName(String userName) {
        elementActions.writeText(userNameField, userName);
        return this;
    }

    public LoginPage enterPassword(String password) {
        elementActions.writeText(passwordField, password);
        return this;
    }

    public LoginPage clickLoginBtn() {
        elementActions.scrollToElement(loginBtn);
        elementActions.clickTheButton(loginBtn);
        return this;
    }
}