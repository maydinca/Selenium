package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ornek4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");


        WebElement userName= driver.findElement(By.id("user-name"));
        userName.click();
        userName.sendKeys("standard_user");

        WebElement userPsw= driver.findElement(By.id("password"));
        userPsw.click();
        userPsw.sendKeys("secret_sauce");
        Thread.sleep(3000);

        WebElement loginElement= driver.findElement(By.xpath("//*[@id='login-button']"));
        Thread.sleep(3000);
        loginElement.click();

        String title=driver.getTitle();
        System.out.println(title);
        String expectedTitle="Swag Laps";

        if(title.equals(expectedTitle)){
            System.out.println("title is correct");
        }else {
            System.out.println("title is not correct");
        }
        String curentUrl=driver.getCurrentUrl();
        System.out.println(curentUrl);

      String expectedurl=driver.getCurrentUrl();
        System.out.println(expectedurl);

        if (curentUrl.equals(expectedurl)){
            System.out.println("correct url");
        }else{
            System.out.println("url is not correct");
        }
//
        WebElement item1= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        item1.click();
        Thread.sleep(3000);
        WebElement item2= driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        item2.click();
        Thread.sleep(3000);
        WebElement item3= driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        item3.click();
        Thread.sleep(3000);
        WebElement Checkout=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        Checkout.click();
    }
}
