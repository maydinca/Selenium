package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ActionClassEtsy {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.etsy.com/ca/");

        Actions action = new Actions(driver);

        List<WebElement> menubars = driver.findElements(By.xpath("//*[@role='menubar']//li"));

        for (WebElement menubar : menubars) {
            action.moveToElement(menubar).perform();
            Thread.sleep(500);
        }
    }
}