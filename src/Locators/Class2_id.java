package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class2_id {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://login.yahoo.com");


        driver.manage().window().maximize();


        //  driver.findElement(By.linkText("Hesap oluştur")).click();

        driver.findElement(By.partialLinkText("oluştur")).click();

        //   driver.findElement(By.id("createacc")).click();

        Thread.sleep(1000);

        String isim = "Mehmet";

        //İsim
        driver.findElement(By.name("firstName")).sendKeys(isim);

        Thread.sleep(1000);
        //Soyad
        driver.findElement(By.id("usernamereg-lastName")).sendKeys("Aydin");


        driver.findElement(By.id("usernamereg-yid")).sendKeys("omero12");


        driver.findElement(By.id("usernamereg-password")).sendKeys("123123");

        driver.findElement(By.className("phone-no ")).sendKeys("012341231212");
    }
}