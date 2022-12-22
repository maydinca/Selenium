package C013;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import static C011_utils.BaseClass.driver;
import static C011_utils.BaseClass.setUp;

/**
 * TC 4.1: Selecting Colors:
 * Open the Chrome browser
 * Go to provided “URL” page where checkboxes are present
 * Loop through the list of elements and find Yellow & Orange colors
 * Select both and print their names to the console
 * Close the browser
 * https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html
 */
public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");  //

        List<WebElement> colorsValue = driver.findElements(By.xpath("//*/input[@name='color']"));


        int count = 1;

        for (int i = 0; i < colorsValue.size(); i++) {
            String attrValue = colorsValue.get(i).getAttribute("value");
            System.out.println(count + ". " + attrValue.toLowerCase());
//            if(attrValue.equals("yellow")){
//                colorsValue.get(i).click();
//            }
            count++;

            System.out.println("----------------");
        }

        for (WebElement color : colorsValue) {
            String attrColor = color.getAttribute("value").toLowerCase();
            if(attrColor.equals("yellow")){
                color.click();
            }
        }
//        for (WebElement colors : colorsValue) {
//            //String attrValue = colorsValues.getAttribute("value");
//
//            if (colorsValues.equals("yellow")) {
//                colorsValues.click();
//            System.out.println("Yellow selected.");
//            //    break;
//            }
            Thread.sleep(2000);
            driver.close();
        }
    }


