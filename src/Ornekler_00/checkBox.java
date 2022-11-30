package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get ("https://demoqa.com/checkbox");

        String homeCheckboxValue= "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homecheckbox =driver.findElement(new By.ByCssSelector(homeCheckboxValue));
        homecheckbox.click();

        homecheckbox=driver.findElement(new By.ByCssSelector(homeCheckboxValue));
        String homeCheckBoxClassName= homecheckbox.getAttribute("class");

        if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is checked!");
        }else {
            System.out.println("Checkbox is not checked!");
        }
    }
}
