package C013;

import C011_utils.ConfigsReader;
import C011_utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

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
public class HW {
    static WebDriver driver;
    boolean isEnabled;
    boolean isDisplayed;
    boolean isSelected;

    public static void main(String[] args) throws InterruptedException {

        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH);

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
        driver.get(ConfigsReader.getProperties("url")); // 1. Go to https://the-internet.herokuapp.com/

        //Click the checkbox
        WebElement checkBoxLabel = driver.findElement(By.xpath("//ul/li[6]/a"));
        checkBoxLabel.click();

        Thread.sleep(500);

        //Checkboxes

        WebElement checkBoxesValue1 = driver.findElement(By.xpath("//*[@type='checkbox'][1]"));
        System.out.println("isSelected : " + checkBoxesValue1.isSelected());
        System.out.println("isEnabled : " + checkBoxesValue1.isEnabled());
        System.out.println("isDisplayed" + checkBoxesValue1.isDisplayed());

        System.out.println("---------------------Checkbox1---------");
        if (checkBoxesValue1.isEnabled() && !(checkBoxesValue1.isSelected())) {
            checkBoxesValue1.click();
            System.out.println("Checkbox 1 is selected.");
        } else {
            System.out.println("it is already selected.");
        }

        WebElement checkBoxesValue2 = driver.findElement(By.xpath("//*[@type='checkbox'][2]"));
        System.out.println("---------------------Checkbox2---------");
        if (checkBoxesValue2.isEnabled() && !(checkBoxesValue2.isSelected())) {
            checkBoxesValue2.click();
            System.out.println("Checkbox 1 is selected.");
        } else {
            System.out.println("checkbox 2 is already selected.");
        }
        System.out.println("---------------------------------");

        Thread.sleep(1000);
        driver.close();

    }
}
