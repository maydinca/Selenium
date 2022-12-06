package C012;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class _01_LoginToExelenter {
    public static WebDriver driver;
    public static void main(String[] args) throws IOException, InterruptedException {
        String filePath= System.getProperty("user.dir")+ "/configs/configuration.properties";
        FileInputStream fis=new FileInputStream(filePath);
        Properties properties=new Properties();
        properties.load(fis);


        String browser = properties.getProperty("browser");

//        switch (browser){
//            case "chrome":
//                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//                driver=new ChromeDriver();
//                break;
//            case "firefox" :
//                System.setProperty("webdriver.geckodriver.driver","drivers/geckodriver.exe");
//                driver = new FirefoxDriver();
//                break;
//            case "edge" :
//                System.setProperty("webdriver.msedgedriver.driver","drivers/msedgedriver.exe");
//                driver = new FirefoxDriver();
//                break;

        switch (browser.toLowerCase()) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.geckodriver.driver", "drivers/geckodriver.exe");
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.msedgedriver.driver", "drivers/msedgedriver.exe");
                driver = new FirefoxDriver();
            }
        }


        driver.get(properties.getProperty("url"));




        Thread.sleep(5000);
        driver.close();
    }
}
