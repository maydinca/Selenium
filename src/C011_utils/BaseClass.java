package C011_utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// NOTE: THIS CLASS IS USED TO LAUNCH AND QUIT THE BROWSER.
public class BaseClass {
   public static WebDriver driver;
    public static void setUp(){
        //  1 ST WAY : Hard -Coding (Not Recommended).
        //  System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        //  WebDriver driver = new ChromeDriver();

        //  2 ST WAY : Soft Code (Recommended).
        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH); // Replaced hard-coded filePath with Constant

        switch (ConfigsReader.getProperties("browser").toLowerCase()){
            case "chrome"->{
                System.setProperty("webriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver =new ChromeDriver();
            }
            case "firefox"->{
                System.setProperty("webriver.gecko.driver",Constants.CHROME_DRIVER_PATH);
                driver =new FirefoxDriver();
            }
            case "edge"->{
                System.setProperty("webriver.msedge.driver",Constants.CHROME_DRIVER_PATH);
                WebDriver driver =new EdgeDriver();
            }
            default -> throw new RuntimeException("Browser is not supported");
        }
        driver.get(ConfigsReader.getProperties("url"));
    }

        // void quit(){

    public static void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        if (driver!=null) { // This line is optional. We only use this line prevent NullPointerException.
            driver.quit();
        }
     }
}
