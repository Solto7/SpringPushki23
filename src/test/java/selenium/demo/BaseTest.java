package selenium.demo;

import helper.ElementActions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import selenium.config.FakeDataProvider;
import selenium.driverFactory.Driver;
import selenium.pages.InstagramLoginPage;
import selenium.pages.LoginPage;
import selenium.pages.ProfilePage;
import selenium.pages.TextBoxPage;

@Listeners(AllureReportListener.class)
public abstract class BaseTest {
    public
    WebDriver driver;
    public ElementActions elementActions;
    public TextBoxPage textBoxPage;
    public InstagramLoginPage instagramLoginPage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public FakeDataProvider fakeDataProvider;

    @BeforeClass
    public void setUpBrowser() {
        driver = Driver.getDriver();
        elementActions = new ElementActions();
        textBoxPage = new TextBoxPage();
        instagramLoginPage = new InstagramLoginPage();
        loginPage = new LoginPage();
        profilePage = new ProfilePage();
        fakeDataProvider = new FakeDataProvider();

    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();

    }
}
