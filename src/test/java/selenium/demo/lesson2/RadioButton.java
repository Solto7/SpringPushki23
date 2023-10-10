package selenium.demo.lesson2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class RadioButton extends BaseTest {
    @Test
    void radioButtonTest(){
        driver.get("https://demoqa.com/radio-button");
        WebElement yesRadioBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[2]/label"));
        yesRadioBtn.click();
        WebElement result = driver.findElement(By.tagName("p"));
        Assert.assertTrue(result.getText().contains("You have selected Yes"));
        Assert.assertTrue(yesRadioBtn.isEnabled());
        WebElement impressiveRadioBtn = driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
        impressiveRadioBtn.click();
        Assert.assertTrue(result.getText().contains("You have selected Impressive"));
        WebElement doULikeThisSite = driver.findElement(By.xpath("//div[text()='Do you like the site?']"));
        Assert.assertTrue(doULikeThisSite.isDisplayed());

    }
}
