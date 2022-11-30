package C002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class reCap {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        /**
         * Driver path from the root: drivers/chromedriver
         * Absolute path: C:\Users\Owner\newJavaEgitimi\Selenium\drivers\chromedriver.exe
         */

        String title= driver.getTitle();
        System.out.println("Title: "+ title);

//        driver.close();
    }

}
