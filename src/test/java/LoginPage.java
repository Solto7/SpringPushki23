import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.pages.BasePage;

    public class LoginPage extends BasePage {

        @FindBy(id = "userName")
        public WebElement userNameField;

        @FindBy(id = "password")
        public WebElement userPasswordField;

        @FindBy(id = "login")
        public WebElement loginBtn;

        public  LoginPage enterUserName(String userName){
            elementActions.writeText(userNameField,userName);
            return this;
        }
        public LoginPage enterPassword(String password){
            elementActions.writeText(userPasswordField,password);
            return  this;
        }
        public LoginPage clickLoginBtn(){
            elementActions.scrollToElement(loginBtn);
            elementActions.clickTheButton(loginBtn);
            return  this;
        }
    }

