package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Window_Handle {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.demo.guru99.com/popup.php");

        //ilk penceremi kaydettim
        String firstWindow = driver.getWindowHandle();

        String firstWindowUrl = driver.getCurrentUrl();
        System.out.println("Başlangıç pencerem :   " + firstWindowUrl);
        driver.findElement(By.xpath("//a[text()='Click Here']")).click();

        //Pencere değişimi için set kullandım.
        Set<String> allWindows = driver.getWindowHandles();

        for (String window : allWindows) {
        //windowun parantez içine sıradaki pencereyi yazdım..
        driver.switchTo().window(window);
        }
        Thread.sleep(1300);
        driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("test@gmail.com");
        driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
        Thread.sleep(5000);
        System.out.println("2. pencerenin Url'i =  " + driver.getCurrentUrl());

        //pencereyi kapatmak için driver.close();
        driver.close();
        driver.switchTo().window(firstWindow);
        System.out.println("Şuanki sayfanın Url'i: " + driver.getCurrentUrl());
        Thread.sleep(2000);
        //sistemi kapatmak için driver.quit();
        driver.quit();
    }
}
