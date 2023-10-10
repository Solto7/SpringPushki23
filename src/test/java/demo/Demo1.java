package demo;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;
import selenium.driverFactory.Driver;


public class Demo1 extends BaseTest {
    @Test
    public void textBoxTest() throws InterruptedException {


        driver = Driver.getDriver();
        driver.get("https://demoqa.com/text-box");


        elementActions.writeText(textBoxPage.userFullName, "James Bond")
                .writeText(textBoxPage.userEmail, "james@bond.com")
                .writeText(textBoxPage.currentAddress, "WallStreet 234")
                .writeText(textBoxPage.permanentAddress, "Some address")
                .clickTheButton(textBoxPage.submitBtn);
        triggerAlert("Hello");
        Thread.sleep(9000);
    }
    public void triggerAlert(String alertMessage){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('"+alertMessage+"');");

    }
}

