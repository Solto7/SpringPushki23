package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.List;

public class DraftDemoQATable extends BaseTest {

    @Test
    void demoq() throws InterruptedException {
        driver.get("https://demoqa.com/webtables");
        driver.findElement(By.id("addNewRecordButton")).click();
        Thread.sleep(5000);
        driver.findElement(By.id("firstName")).sendKeys("John");
        driver.findElement(By.id("lastName")).sendKeys("John2");
        driver.findElement(By.id("userEmail")).sendKeys("John@gmail.com");
        driver.findElement(By.id("age")).sendKeys("18");
        driver.findElement(By.id("salary")).sendKeys("18222");
        driver.findElement(By.id("department")).sendKeys("NewYork");
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        List<WebElement> users = driver.findElements(By.xpath("//div[@class='rt-tbody']"));
        for (WebElement element:users){
            System.out.print(element.getText());
        }
    }
}
