package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://ca.yahoo.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@class='_yb_8876i']")).click();
        driver.findElement(By.id("login-username")).sendKeys("test");

        Thread.sleep(3000);
        driver.close();



    }
}
