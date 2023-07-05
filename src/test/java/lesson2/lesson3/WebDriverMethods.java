package lesson2.lesson3;

import com.beust.ah.A;
import lesson2.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class WebDriverMethods extends BaseTest {
    @Test
    void demo() throws InterruptedException {
        driver.navigate().to("https://nambafood.kg/");
        driver.findElement(By.xpath("(//a[@class='menu-link '])[2]")).click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        System.out.println(driver.getPageSource());

    }
    @Test
    void demo2 () throws InterruptedException {
        driver.navigate().to("https://demoqa.com/browser-windows");
        driver.findElement(By.id("tabButton")).click();
        Thread.sleep(3000);
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(0));
        Thread.sleep(5000);
    }
}
