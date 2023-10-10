import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.pages.BasePage;

public class RegisterPage extends BasePage {

    @FindBy(id = "firstname")
    public WebElement registerUserFirstNameFiels;

    @FindBy(id = "lastname")
    public WebElement registerUserLastName;

    @FindBy(id = "username")
    public WebElement registerUserNameField;

    @FindBy(id = "password")
    public WebElement registerUserPasswordField;

    @FindBy(id = "recaptcha-anchor")
    public WebElement captchaBtn;

    @FindBy(id = "register")
    public WebElement registerBtn;

}
