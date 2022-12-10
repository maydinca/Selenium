package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DinamikElemenltler3 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/dynamic-properties");

        WebElement textElement =driver.findElement(By.xpath("//div/button"));
        String text=textElement.getText();
        System.out.println("text = " + text);

        WebElement firstButton = driver.findElement(By.id("enableAfter"));
        WebDriverWait wait =new WebDriverWait (driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(firstButton));
        firstButton.click();



        // WebElement textElement = driver.findElement(By.xpath("//div/button"));
    }
}
