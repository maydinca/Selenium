package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButttonsDubleOrRightClick {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demoqa.com/buttons");

        WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));

        Actions action =new Actions(driver);
        action.doubleClick(doubleClickButton).perform();

        WebElement doubleClickMessage= driver.findElement(By.id("doubleClickMessage"));
        System.out.println("After action message : "+doubleClickMessage.getText());

        WebElement rightClickButton=driver.findElement(By.id("rightClickBtn"));
        action.contextClick(rightClickButton).perform();

        WebElement rightClickMessage= driver.findElement(By.id("rightClickMessage"));
        System.out.println(rightClickMessage.getText());



        Thread.sleep(5000);
        driver.close();

    }
}
