package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.automationtesting.in/Alerts.html");

        // todo     Simple Alert
        driver.findElement(By.cssSelector(".btn.btn-danger")).click();
        Thread.sleep(2000);

        String message1 = driver.switchTo().alert().getText();
        System.out.println(message1);
        Thread.sleep(1000);
        driver.switchTo().alert().accept();

        // todo     Confirm

        driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
        driver.findElement(By.cssSelector(".btn.btn-primary")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();

        //todo     Demonstrate the prompt box
        driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
        driver.findElement(By.cssSelector(".btn.btn-info")).click();
        Thread.sleep(1500);
        driver.switchTo().alert().sendKeys("Test");
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        String message = driver.findElement(By.cssSelector("#Textbox>p")).getText();
        System.out.println("Message: " + message);

    }
}

