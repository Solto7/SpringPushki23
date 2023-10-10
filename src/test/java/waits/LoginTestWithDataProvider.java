package waits;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class LoginTestWithDataProvider extends BaseTest {


    @DataProvider(name = "loginData")
    public Object[][] provideTestData() {
        return new Object[][] {
                {"John", "HelloWorld","Invalid username or password!"},
                {"kate", "HelloWorld312","Invalid username or password!"},
                {"john", "HelloWorld2222222!","Invalid username or password!"},
                {"kate", "FakePassword2222222!","Invalid username or password!"}
        };
    }
    @Test(dataProvider = "loginData")
    public void loginTest(String name, String password,String errorMessage) {
        driver.get("https://demoqa.com/login");
        loginPage.enterUserName(name)
                .enterPassword(password)
                .clickLoginBtn();
        Assert.assertEquals(loginPage.errorMessage.getText(),errorMessage);
    }
}

