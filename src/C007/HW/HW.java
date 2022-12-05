package C007.HW;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HW {
    static String color1 = "orange";
    static String color2 = "yellow";
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //we are retrieving the list of web elements.
        List<WebElement> checkBoxColor = driver.findElements(By.xpath("//input[@name='color']"));

        //Get the size of the list
        int checkBoxColorCount = checkBoxColor.size();
        System.out.println("browserCount = " + checkBoxColorCount);

        //1.Regular Loop

        int count = 1;

        for (int i = 0; i < checkBoxColor.size(); i++) {
            String colorAttrValue = checkBoxColor.get(i).getAttribute("value");
            System.out.println(count + ". " + colorAttrValue);
            count++;
        }
//        for (WebElement element : checkBoxColor) {
//            if (element.isSelected() && !element.isSelected()) {
//                System.out.println(element.getAttribute("value"));
//            }
//        }
//        for (WebElement colorsValue : checkBoxColor) {
//            String colorAttrValue = colorsValue.getAttribute("value");
//
//            if (colorAttrValue.contains(color1) ||
//                    colorAttrValue.contains(color2)) {
//
//                colorsValue.click();
//                System.out.println("Orange or Yellow is found and selected");
//            }
//        }
        Thread.sleep(4000);
        driver.close();
    }
}