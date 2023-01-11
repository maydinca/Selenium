package C018_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static C011_utils.BaseClass.*;
import static C011_utils.CommonMethods.clickRadioORCheckbox;

public class _02_RadioOrCheckBoxTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");

        //Loop through all colors and select and click on Green color
        List<WebElement> colorList= driver.findElements(By.name("color"));
        List<WebElement> browserList= driver.findElements(By.name("browser"));

        String expectedValue="green";
        clickRadioORCheckbox(colorList,expectedValue);
        clickRadioORCheckbox(browserList,"Mozilla");

//        for (WebElement color :colorList) {
//            String colorAttribute =color.getAttribute("value");
//            if (colorAttribute.equalsIgnoreCase(expectedValue)){
//                color.click();
//                break;
//            }
//        }

    tearDown();


    }

}
