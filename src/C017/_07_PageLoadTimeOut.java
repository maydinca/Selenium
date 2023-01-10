package C017;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.time.Instant;

public class _07_PageLoadTimeOut {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");  // chromedriver.exe
        WebDriver driver = new ChromeDriver();
        /**
         * I am telling the browser, stop Looking after given time, in this case,stop loading after 3 seconds.
         * In other words, I am telling the webpage = "You got 1 sec to load OR I will throw an exception"
         */
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3)); //<== This is Page Load TimeOut Wait.

        Instant startTime = Instant.now();
        System.out.println("startTime = " + startTime);

        try{
        driver.get("https://amazon.com/");

        }catch (Exception e){
            e.printStackTrace();
            System.out.println("========> Too Slow to load.... Add More Time <======= ");
        }


        Instant endTime = Instant.now();
        System.out.println("endTime = " + endTime);

        Duration pageLoadTime=Duration.between(startTime,endTime);
        System.out.println("pageLoadTime = " + pageLoadTime.toMillis());
        System.out.println(driver.getTitle());
        driver.close();

    }
}
