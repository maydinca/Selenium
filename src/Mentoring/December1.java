package Mentoring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class December1 {
   /* TC1.1 Click Random Menu item
1. Navigate to https://www.etsy.com/
2. Get the list of Menu WebElements displayed
3. Convert list of Menu WebElements to String list
4. Click on Random Menu item
6. Validate if both String list and WebElement list have same size
7. Generate a random index and check if product names in both lists are equal

    */

    static WebDriver driver;
    @BeforeMethod
    public void initialize_driver() {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.etsy.com");
        driver.manage().window().maximize();
    }

    @Test
    public static void listOfMenuItems(){
        List<WebElement> menuWebElementList = driver.findElements(By.xpath("//*[@data-ui='top-nav-category-list']//li"));
        List<String> menuStringList = getListOfWebElements(menuWebElementList);
    }

    public static List<String> getListOfWebElements(List<WebElement> webElementList){
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < webElementList.size(); i++) {
            System.out.println(webElementList.get(i));
            System.out.println(webElementList.get(i).getText());
            stringList.add(webElementList.get(i).getText());
        }
        return stringList;
    }

}
