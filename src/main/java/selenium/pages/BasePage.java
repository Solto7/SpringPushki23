package selenium.pages;

import helper.ElementActions;
import org.openqa.selenium.support.PageFactory;
import selenium.driverFactory.Driver;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    public ElementActions elementActions = new ElementActions();

}
