package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com");
        driver.manage().window().maximize();


        driver.findElement(By.partialLinkText("Kullanıcı")).click();


        driver.findElement(By.className("phone-no")).sendKeys("test123@gmail.com");

        driver.findElement(By.name("verifyYid")).click();

    }
}
