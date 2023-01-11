package C018_DevelopFunctions;

import C011_utils.CommonMethods;
import C011_utils.ConfigsReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static C011_utils.BaseClass.*;
import static C011_utils.CommonMethods.clickButWaitForClickability;
import static C011_utils.CommonMethods.sendText;

public class _01_LoginTest {
    public static void main(String[] args) {
        setUp("https://exelentersdet.com");

        // This is without function, direct access, locate and use.
//        WebElement username = driver.findElement(By.id("txtUsername"));
//        username.sendKeys("Admin");

        // Second way, with function
        WebElement username = driver.findElement(By.id("txtUsername"));
//        sendText(username, "Admin");
        sendText(username, ConfigsReader.getProperties("username"));

        WebElement password = driver.findElement(By.id("txtPassword"));
        sendText(password,ConfigsReader.getProperties("password"));

        WebElement loginBtn = driver.findElement( By.id("btnLogin"));
        CommonMethods.click(loginBtn);
        //
        clickButWaitForClickability(loginBtn);




        tearDown();
    }


/**
 *  To access method of one class from another class/package.
 *      1. import statically
 *      2. Extends nameOfCLass
 *      3. NameOfClass.method()
 */
}
