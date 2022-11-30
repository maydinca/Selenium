package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dinamikElementler {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        WebElement dynamicClickButton=driver.findElement(By.xpath("//div[last()]/button"));
                                                                                //(//div/button)[3]
        dynamicClickButton.click();
//        System.out.println("dynamicClick.getText()");

    WebElement dynamicClickMessage= driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(dynamicClickMessage.getText());


    }
}
