package lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButton extends BaseTest{
    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        yesRadioBtn.click();
        WebElement yesResult = driver.findElement(By.tagName("p"));
        Assert.assertTrue(yesResult.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());
        WebElement impressiveRadioBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
    }
}
