package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragAndDrop {
    public static WebDriver driver;
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


    //Cities
        WebElement Oslo=driver.findElement(By.xpath("(//*[contains(text(),'Oslo')])[2]"));
        WebElement Madrid=driver.findElement(By.xpath("(//*[contains(text(),'Madrid')])[2]"));
        WebElement Stockholm=driver.findElement(By.xpath("(//*[contains(text(),'Stockholm')])[2]"));
        WebElement Washington=driver.findElement(By.xpath("(//*[contains(text(),'Washington')])[2]"));
        WebElement Copenhagen=driver.findElement(By.xpath("(//*[contains(text(),'Copenhagen')])[2]"));
        WebElement Seoul=driver.findElement(By.xpath("(//*[contains(text(),'Seoul')])[2]"));
        WebElement Rome=driver.findElement(By.xpath("(//*[contains(text(),'Rome')])[2]"));

    //Countries
        WebElement Italy=driver.findElement(By.xpath("(//*[contains(text(),'Italy')])"));
        WebElement Norway=driver.findElement(By.xpath("(//*[contains(text(),'Norway')])"));
        WebElement South_Korea=driver.findElement(By.xpath("(//*[contains(text(),'South Korea')])"));
        WebElement United_State=driver.findElement(By.xpath("(//*[contains(text(),'United State')])"));
        WebElement Spain=driver.findElement(By.xpath("(//*[contains(text(),'Spain')])"));
        WebElement Denmark=driver.findElement(By.xpath("(//*[contains(text(),'Denmark')])"));
        WebElement Sweden=driver.findElement(By.xpath("(//*[contains(text(),'Sweden')])"));

        Actions action =new Actions(driver);
        action.dragAndDrop(Oslo,Norway).build().perform();
        action.dragAndDrop(Madrid,Spain).build().perform();
        action.dragAndDrop(Seoul,South_Korea).build().perform();
        action.dragAndDrop(Rome,Italy).build().perform();
        action.dragAndDrop(Copenhagen,Denmark).build().perform();
        action.dragAndDrop(Stockholm,Sweden).build().perform();
        action.dragAndDrop(Washington,United_State).build().perform();




    }
}
