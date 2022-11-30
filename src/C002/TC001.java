package C002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC001 {

    //TC 1: Amazon Page Title Verification:
    //Open the chrome browser
    //Go to “https://www.amazon.com/
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();


        String title = driver.getTitle();
        System.out.println("Title: " + title);
        System.out.println(title);


        String expectedTitle= "Amazon.com. Spend less. Smile more.!";
        if (title.equals(expectedTitle)){
            System.out.println("Test passed. Title is correct!");
        }else{
            System.out.println("Test Failed.Title is not correct");
        }
        driver.close();
    }
}
