package selenium.helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class DropDownHelper {

    public static void selectUsingVisibleText(WebElement element, String txt) {
        Select select = new Select(element);
        select.selectByVisibleText(txt);
    }

    public static void selectUsingValue(WebElement element, String txt) {
        Select select = new Select(element);
        select.selectByValue(txt);
    }

    public static void selectUsingIndex(WebElement element, int index) {
        Select select = new Select(element);

    }

    public static List<String> getAllDropDownValues(WebElement locators) {
        Select select = new Select(locators);
        List<WebElement> elements = select.getAllSelectedOptions();
        List<String> valueList = new LinkedList<>();

        for (WebElement element : elements) {
            valueList.add(element.getText());
        }
        return valueList;
    }

    public static void selectRandomColor(WebElement element) {
        Random random = new Random();
        List<String> colors = List.of("Red", "Black", "Blue", "White", "Purple", "Aqua", "Magneto", "Indigo");

        int index = random.nextInt(colors.size());
        String color = colors.get(index);

        selectUsingVisibleText(element,color);

    }
}
