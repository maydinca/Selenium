package C004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementFacebook {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Navigate to Facebook page
        driver.get("https://facebook.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Lets practice using locators to locate web element on FB page
        driver.findElement(By.id("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("123456789");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();
        Thread.sleep(2000);
//        driver.findElement(By.className("_97w4")).click();
//        driver.findElement(By.linkText("Forgot password?")).click();
//        driver.findElement(By.partialLinkText("Forgot")).click();
        driver.findElement(By.partialLinkText("password?")).click();


    }
}
