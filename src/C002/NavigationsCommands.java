package C002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.*;

public class NavigationsCommands {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver(); //launch the browser for us


        driver.get ("https://www.google.com");
        Thread.sleep(2000);
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);


//        String title=driver.getTitle();
//        System.out.println("Title : "+title);



    }
}
