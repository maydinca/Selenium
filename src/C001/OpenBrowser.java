package C001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {


    //1. Establish a connection with the driver (s)
    System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe"); //Windows users add.exe at the end like this.
    //2. open the browser using the Chrimedriver's class constructor
        WebDriver driver= new ChromeDriver(); //launch the browser for us
//navigate the google website
        driver.get ("https://google.com");

        //Retrieve the title of the current website and store it in a String
        String title=driver.getTitle();
        System.out.println("Title : "+title);
        //Go to google website and retreive the URL and print it the console:

        System.out.println("getcurrentURL : " +driver.getCurrentUrl());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.quit();
    }
}
