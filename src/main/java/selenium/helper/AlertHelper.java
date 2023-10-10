package selenium.helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import selenium.driverFactory.Driver;

import java.sql.DriverManager;
import java.time.Duration;

public class AlertHelper {
    private  WebDriver driver = Driver.getDriver();

    public  AlertHelper(WebDriver driver){
        this.driver = driver;
    }
    public Alert switchToAlert(){
        return driver.switchTo().alert();
    }
    public void acceptAlert(){
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.alertIsPresent());
        switchToAlert().accept();
    }
    public void dismissAlert(){
        switchToAlert().dismiss();
    }
    public void sendKeysAlert(String txt){
        switchToAlert().sendKeys(txt);
        switchToAlert().accept();
    }
    public boolean isAlertPresented(){
        try {

            driver.switchTo().alert().accept();
            return true;
        }catch (NoAlertPresentException e ){
            System.out.println("No such Alert");
            return false;
        }
    }

    public void acceptAlertIfPresented(){
        if (!isAlertPresented()){
            return;
        }
    acceptAlert();
    }

}
