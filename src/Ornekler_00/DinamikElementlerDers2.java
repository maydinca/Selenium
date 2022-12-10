package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DinamikElementlerDers2 {
    private static String url = "https://demoqa.com/buttons";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Actions action = new Actions(driver);
        List<WebElement> listClickMeElements = driver.findElements(By.xpath("//div/button"));

//        for (int i = 0; i <listClickMeElements.size() ; i++) {
//            Thread.sleep(500);
//            listClickMeElements.get(i).click();

        for (WebElement clickElements : listClickMeElements) {
            action.moveToElement(clickElements).perform();
            Thread.sleep(500);
        }
        WebElement clickMeDynamicElement = driver.findElement(By.xpath("(//div/button)[3]"));
        clickMeDynamicElement.click();
        String clickMeDynamicText = clickMeDynamicElement.getText();
        System.out.println("ClickMeDynamicText = " + clickMeDynamicText);




    }

}

