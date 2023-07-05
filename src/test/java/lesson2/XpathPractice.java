package lesson2;

import org.testng.annotations.Test;

public class XpathPractice extends BaseTest{

    @Test
    void xpathDemo1(){
        driver.get("https://demoqa.com/text-box");
    }
}
