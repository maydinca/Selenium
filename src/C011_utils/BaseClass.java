package C011_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

// NOTE: THIS CLASS IS USED TO LAUNCH AND QUIT THE BROWSER.
public class BaseClass {
    public static WebDriver driver;
    public static void setUp(String url) {            // NOTE: THIS CLASS IS USED TO LAUNCH AND QUIT THE BROWSER

                                //  1 ST WAY : Hard -Coding (Not Recommended).
                                //  System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                                //  WebDriver driver = new ChromeDriver();

                                //  2 ST WAY : Soft Code (Recommended).

            ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH); // Replaced hard-coded filePath with Constants
            switch (ConfigsReader.getProperties("browser").toLowerCase()) {
                case "chrome" -> {
                    System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                    driver = new ChromeDriver();
                }
                case "firefox" -> {
                    System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                    driver = new FirefoxDriver();
                }
                default -> throw new RuntimeException("Browser is not supported");
            }

//            driver.get(ConfigsReader.getProperties("url"));
               driver.get(url);               //URL i config icerisinden almamak icin ..
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

        // void quit(){

    public static void tearDown() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.getStackTrace();
        }
        if (driver != null) {     // This line is optional. We only use it to prevent NullPointerException.
            driver.quit();
        }
    }
}
