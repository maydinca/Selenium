package C013;

import C011_utils.ConfigsReader;
import C011_utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static C011_utils.BaseClass.tearDown;

/**
 * 1. Go to https://the-internet.herokuapp.com/
 * 2. Find the Checkboxes link, click on it
 * 3. Once you are on the Checkboxes homepage you will see two Checkboxes:
 *       - checkbox 1
 *       - checkbox 2
 *
 *   4. Using your Selenium knowledge. Please check and verify if each checkbox is:
 *         1. isDisplayed (True or False) ?
 *         2. isEnabled (T or F) ?
 *         3. isSelected (T or F) ?
 *
 * 5. Print the results to the console.
 * 6. Exit the browser.
 *
 *
 *
 */
public class HW1_2ndWay {
    static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {

        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH);

        switch (ConfigsReader.getProperties("browser").toLowerCase()) {
            case "chrome" -> {
                System.setProperty("webriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                driver = new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webriver.gecko.driver", Constants.CHROME_DRIVER_PATH);
                driver = new FirefoxDriver();
            }
            case "edge" -> {
                System.setProperty("webriver.msedge.driver", Constants.CHROME_DRIVER_PATH);
                WebDriver driver = new EdgeDriver();
            }
            default -> throw new RuntimeException("Browser is not supported");
        }
        driver.get(ConfigsReader.getProperties("url")); // https://the-internet.herokuapp.com/

        //Click the checkbox
        WebElement checkBoxClick = driver.findElement(By.xpath("//ul/li[6]/a"));
        checkBoxClick.click();
        Thread.sleep(2000);

        //Checkboxes
        List<WebElement> checkBoxes=driver.findElements(By.xpath("//form/input"));

        int browserCount = checkBoxes.size();
        System.out.println("checkBoxesCount = " + browserCount);

        int count = 1;

        for (int i = 0; i < checkBoxes.size(); i++) {
            String attrValue = checkBoxes.get(i).getAttribute("type");
            System.out.println(count + ". " + attrValue);

            if(checkBoxes.get(i).isSelected()) {
                System.out.println("Checbox" + (i + 1)+ " :"+"is selected");
            }else {
                System.out.println("Checbox" + (i + 1)+ " :"+ "is not selected");
            }
            if(checkBoxes.get(i).isEnabled()) {
                System.out.println("Checbox" + (i + 1)+ " :"+"is enabled");
            }else {
                System.out.println("Checbox" + (i + 1) + " :"+ "is not enabled");
            }
            if(checkBoxes.get(i).isDisplayed()) {
                System.out.println("Checbox" + (i + 1)+ " :"+ "is displayed");
            }else {
                System.out.println("Checbox" + (i + 1)+ " :" + "is not displayed");
            }
            count++;
        }

        Thread.sleep(1000);
        driver.close();

        tearDown();
        }
    }
