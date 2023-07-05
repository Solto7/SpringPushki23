package selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.WebElementActions;

import java.time.Duration;

public class SeleniumIntro {

    @Test
    public void textBoxTest() {

        WebDriverManager.chromedriver().setup(); // setup Chrome driver Binary
        WebDriver driver = new ChromeDriver(); //  // Object Drivers
        driver.manage().window().maximize(); //  to maximize the window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // Waiting the elements in page
        driver.get("https://demoqa.com/text-box");

        WebElement username = driver.findElement(By.id("userName"));
        username.sendKeys("James Bond");

        WebElement userEmail = driver.findElement(By.id("userEmail"));
        userEmail.sendKeys("james.bond@gmail.com");

        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Wall Street 221");

        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Trump Tower");

        WebElement submitBtn = driver.findElement(By.id("submit"));
        WebElementActions.scrollToElement(driver, submitBtn);
        submitBtn.click();

        WebElement resultEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(resultEmail.getText().contains("james.bond@gmail.com"));
        WebElement resultName = driver.findElement(By.id("name"));
        Assert.assertTrue(resultName.getText().contains("James Bond"));

        WebElement resultCurrentAdrress = driver.findElement(By.xpath("//p[@id='currentAddress']"));
        Assert.assertTrue(resultCurrentAdrress.getText().contains("Wall Street 221"));

        WebElement resultPermanentAdress = driver.findElement(By.xpath("//p[@id='permanentAddress']\n"));
        Assert.assertTrue(resultPermanentAdress.getText().contains("Trump Tower"));

        driver.quit();

    }
}
