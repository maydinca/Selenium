package Ornekler_00;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.opencart.com");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("input-email")).sendKeys("jonisherin@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("qwertyu2022");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();
        driver.findElement(By.id("input-pin")).sendKeys("1590");
        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        String welcome_message = driver.findElement(By.xpath("//p[text() = 'Welcome to OpenCart!']")).getText();
        System.out.println("welcome_message = " + welcome_message);
        Assert.isTrue("Welcome to OpenCart!".equals(welcome_message), "Wrong Page");

        driver.quit();

    }
}

