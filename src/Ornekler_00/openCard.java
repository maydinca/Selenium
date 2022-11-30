package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openCard {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.opencart.com/");

        String loginElement= "a[class='btn btn-link navbar-btn']";

        WebElement loginWeb = driver.findElement(By.cssSelector(loginElement));
        loginWeb.click();

        WebElement emailElement=driver.findElement(By.name("email"));
        emailElement.sendKeys("jonisherin@gmail.com");
        WebElement psw= driver.findElement(By.name("password"));
        psw.sendKeys("qwertyu2022");

        WebElement logginElement=driver.findElement(By.cssSelector("button.btn[class='btn btn-primary btn-lg hidden-xs']"));
        logginElement.click();

        WebElement pinElement =driver.findElement(By.name("pin"));
        pinElement.sendKeys("1590");

        WebElement continueElement =driver.findElement(By.cssSelector("button.btn[class='btn btn-primary btn-lg']"));
        continueElement.click();


         }
    }

