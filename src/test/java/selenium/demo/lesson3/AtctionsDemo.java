package selenium.demo.lesson3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import selenium.demo.BaseTest;

import static org.testng.AssertJUnit.assertTrue;


public class AtctionsDemo extends BaseTest {
    @Test
    void demo1() throws InterruptedException {
        driver.get("https://demoqa.com/buttons");
        WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
        Actions actions = new Actions(driver);

        actions.doubleClick(doubleClick).perform();
        assertTrue(driver.findElement(By.id("doubleClickMessage")).isDisplayed());

        WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
        actions.contextClick(rightClick).perform();
        Thread.sleep(5000);

        WebElement clickMe = driver.findElement(By.xpath("//button[text()='Click Me']"));
        actions.click(clickMe).perform();
        Thread.sleep(5000);

//        actions.clickAndHold();
//        actions.moveToElement();
//        actions.dragAndDrop();

    }

    @Test
    void demo2() throws InterruptedException {
        driver.get("https://demoqa.com/droppable");
        WebElement dragAndDrop = driver.findElement(By.id("draggable"));
        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.id("draggable"));
        WebElement target = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(source, target).perform();
        Thread.sleep(5000);

    }

    @Test
    void demo3() throws InterruptedException {
        driver.get("https://demoqa.com/resizable");
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        WebElement dragArrow = driver.findElement(By.xpath("(//span[@class='react-resizable-handle react-resizable-handle-se'])[1]"));
        actions.moveToElement(dragArrow).clickAndHold().moveByOffset(300, 100).perform();
        Thread.sleep(3000);
    }
}
