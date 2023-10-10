package selenium.demo.lesson2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

public class XpathPractice extends BaseTest {

    @Test
    void xpathDemo1() {
        driver.get("https://demoqa.com/text-box");
    }

    @Test
    void xpathFindByTextTest() {
        driver.get("https://demoqa.com/text-box");
        String permanentAddress = driver.findElement(By.xpath("//label[text()='Permanent Address']")).getText();
        System.out.println(permanentAddress);

    }

    @Test
    void xpathFindByContainsTextTest() {
        driver.get("https://demoqa.com/text-box");
        String permanentAddress = driver.findElement(By.xpath("//label[contains(text(),'Current')]")).getText();
        System.out.println(permanentAddress);
    }

    @Test
    void xpathFindByNormalizeSpaceTextTest() { // Trim
        driver.get("https://nambafood.kg/");
        String permanentAddress = driver.findElement(By.xpath("//div[normalize-space()='Как работает NambaFood']")).getText();
        System.out.println(permanentAddress);
    }
}
