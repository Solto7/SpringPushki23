package selenium.demo.alertTest;

import helper.AlertHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.time.Duration;

public class AlertDemoTests extends BaseTest {

    @Test
    void alertDemo() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("alertButton")).click();
        AlertHelper alertHelper = new AlertHelper(driver);
        alertHelper.acceptAlert();
        Thread.sleep(5000);
        driver.findElement(By.id("timerAlertButton")).click(); // click alert

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        alertHelper.acceptAlert();
        Thread.sleep(3000); // click after 5 sec

        driver.findElement(By.id("confirmButton")).click();
        alertHelper.disMissAlert();  // click cancel alert

        driver.findElement(By.id("promtButton")).click();
        alertHelper.sendKeysAlert("Hello World");
        Thread.sleep(5000); // write text to alert and click ok or cancel

//        AlertHelper alertHelper1 = new AlertHelper(driver);
//        driver.findElement(By.id("timeralertButton")).click();
//        alertHelper.acceptAlert();
//        Thread.sleep(5000);
    }

}

