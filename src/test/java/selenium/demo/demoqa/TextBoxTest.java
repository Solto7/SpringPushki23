package selenium.demo.demoqa;

import com.digitalnomads.webElementsActions.Draft;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.config.FakeDataProvider;
import selenium.demo.BaseTest;
import selenium.helper.models.User;
import selenium.pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    void textBoxTest() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");

        FakeDataProvider fakeDataProvider = new FakeDataProvider();
        TextBoxPage textBoxPage1 = new TextBoxPage();
        User user = new User(fakeDataProvider.generateFakeFullName(),
                fakeDataProvider.generateFakeEmail(),
                fakeDataProvider.generateFakeAddress(),
                fakeDataProvider.generateFakePermanentAddress());



        textBoxPage1.fillUpTheForm(user);
        Thread.sleep(5000);
        String userName = user.getUserName();
        String userEmail = user.getUserEmail();
        String userCurrentAddress = user.getUserCurrentAddress();
        String userPermanentAddress = user.getUserPermanentAddress();

        Assert.assertTrue(textBoxPage1.resultFullName.getText().contains(userName));
        Assert.assertTrue(textBoxPage1.resultEmail.getText().contains(userEmail));
        Assert.assertTrue(textBoxPage1.resultCurrentAddress.getText().contains(userCurrentAddress));
        Assert.assertTrue(textBoxPage1.resultPermanentAddress.getText().contains(userPermanentAddress));


    }

}
