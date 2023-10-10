package selenium.driverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import selenium.config.ConfigReader;

import java.time.Duration;

public class SafariWebDriver {
    public static WebDriver loadSafariDriver() {
        WebDriverManager.safaridriver().setup();
        SafariOptions options = new SafariOptions();
//        options.addArguments("--disable-extensions");
        // Set any desired Safari options
//        if (Boolean.parseBoolean(ConfigReader.getProperty("headless"))){
//            options.addArguments("--headless");
//        }

        WebDriver driver = new SafariDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }
}
