package C004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillOutTheForm {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get ("https://demo.guru99.com/test/newtours/register.php");
        driver.manage().window().maximize();

        WebElement firstName= driver.findElement(By.name("firstName"));
        firstName.click();
        firstName.sendKeys("Mehmet");

        WebElement lastName= driver.findElement(By.name("lastName"));
        lastName.click();
        lastName.sendKeys("Ali");

        WebElement phoneNumber= driver.findElement(By.name("phone"));
        phoneNumber.click();
        phoneNumber.sendKeys("123456789");


        WebElement email= driver.findElement(By.id("userName"));
        email.click();
        email.sendKeys("test@gmail.com");

        WebElement userName= driver.findElement(By.id("email"));
        userName.click();
        userName.sendKeys("test@gmail.com");

        WebElement userPassword= driver.findElement(By.name("password"));
        userPassword.click();
        userPassword.sendKeys("123456789");

        WebElement userPasswordConfirm= driver.findElement(By.name("confirmPassword"));
        userPasswordConfirm.click();
        userPasswordConfirm.sendKeys("123456789");

        WebElement submit= driver.findElement(By.name("submit"));
        submit.click();



    }
}
