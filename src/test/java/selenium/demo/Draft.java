package selenium.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Draft {


  public void nambaFood(){

     WebDriverManager.chromedriver().setup();//(//button[@type='submit'])[1]
     WebDriver webDriver1 = new ChromeDriver();
     webDriver1.manage().window().maximize();
     webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     webDriver1.get("https://nambafood.kg/cafe/national");

     WebElement username = webDriver1.findElement(By.xpath("(//div[@class='cafe--name'])[1]"));

     username.click();
     webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

     webDriver1.get("https://nambafood.kg/mubarak-gogolya");
     WebElement mubarak = webDriver1.findElement(By.xpath("(//div[@class='card--item--prev'])[1]"));
//     WebElementActions.scrollToElement(webDriver1,mubarak);
     webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

     WebElement chiChi = webDriver1.findElement(By.xpath("(//button[@class='status active bay_item'])[1]"));
     chiChi.click();
     chiChi.click();
     webDriver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));


     WebElement korzina = webDriver1.findElement(By.xpath("/div[@class='btn menu-link']"));
     korzina.click();









 }
}
