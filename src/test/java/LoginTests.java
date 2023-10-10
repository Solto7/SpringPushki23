
import enums.ErrorMessages;
import enums.LoginCredentials;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static enums.LoginCredentials.johnPassword;
import static enums.LoginCredentials.johnUserName;


public class LoginTests extends BaseTest {

    @BeforeClass
    public void createNewUser() {
    }

    @Test(description = "Login with valid credentials")
    void loginWithValidCredentials() {

        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(LoginCredentials.johnUserName.getCredential());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLoginBtn();
        Assert.assertEquals(profilePage.profileTitle.getText(), "Profile");
    }

    @Test(description = "Login with invalid username")
    void loginWithInvalidUserName() throws InterruptedException {
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(fakeDataProvider.generateFakeFullName());
        loginPage.enterPassword(johnPassword.getCredential());
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.errorMessage.getText(), ErrorMessages.class);
    }

    @Test(description = "Login with invalid password")
    void loginWithInvalidPassword() {
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(johnUserName.getCredential());
        loginPage.enterPassword(fakeDataProvider.generateFakePassword());
        loginPage.clickLoginBtn();
         Assert.assertEquals(loginPage.errorMessage.getText(), ErrorMessages.class);
    }

    @Test(description = "Login with invalid username and invalid password")
    void loginWithInvalidUsernameAndPassword() {
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(johnUserName.getCredential());
        loginPage.enterPassword(fakeDataProvider.generateFakePassword());
        loginPage.clickLoginBtn();
        Assert.assertEquals(loginPage.errorMessage.getText(), ErrorMessages.class);
    }
}

