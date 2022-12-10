package C013;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static C011_utils.BaseClass.driver;
import static C011_utils.BaseClass.setUp;

public class DropdownDemo2 {

    public static void main(String[] args) throws InterruptedException {
        setUp();



        WebElement countryDD = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDD);

        //Note: Select class provides three different options(methods) to select a value from  a drop-down.

        //1.By Index
        select.selectByIndex(1);

        Thread.sleep(500);
        //2. By Value
        select.selectByValue("JP");

        //3.By Visible Text
        select.selectByVisibleText("Italy");





        }
    }




