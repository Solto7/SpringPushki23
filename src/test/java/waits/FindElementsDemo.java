package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import java.util.List;

public class FindElementsDemo extends BaseTest {

    @Test
    void  demo1(){
        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone", Keys.ENTER);
        List<WebElement> brandList = driver.findElements(By.xpath("//div[@id='brandsRefinements']/ul/span/li/span/a/span"));
 // findElements для того что бы вытащитть весь список на консоль ul
        for (WebElement element:brandList){
            System.out.println(element.getText());
        }
    }
}
