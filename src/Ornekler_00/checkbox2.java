package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");


//        String sportCheckbox = "hobbies-checkbox-1";
        WebElement sportCheckbox = driver.findElement(By.id("hobbies-checkbox-1"));
        boolean isEnabled = sportCheckbox.isEnabled();
        System.out.println("Tiklanabilir mi : " + isEnabled);

        WebElement sportCheckBoxLabel = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));


        if (isEnabled){
            try {
                System.out.println("Entered try block");
                sportCheckbox.click();
            }catch (ElementClickInterceptedException e) {
                sportCheckBoxLabel.click();
                System.out.println("Entered catch block!");
            }
        }
        boolean isSelected = sportCheckbox.isSelected();
        System.out.println("Secilmis mi :" + isSelected);
    }

}