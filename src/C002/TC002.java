package C002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC002 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Open the chrome browser
        Nagigate to https://www.exelenter.com
        Nagigate to https://www.google.com

        Nagigate to exelenterpage
        refresh the current page

        Verify URL contains "Exelenter"
        close browser

         */
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);


        driver.navigate().to("https://www.exelenter.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        driver.navigate().back(); //exelenter
        Thread.sleep(2000);


        driver.navigate().refresh();

        String webUrl=driver.getCurrentUrl();
        webUrl.equalsIgnoreCase(driver.getCurrentUrl());

        if (webUrl.contains("exelenter")){
            System.out.println(webUrl+"you are on correct website!");

        }else {
            System.out.println(webUrl+"You are on wrong website");
        }

        driver.close();
    }
}
