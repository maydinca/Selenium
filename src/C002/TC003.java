package C002;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC003 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get ("https://exelenter.com/contact/");
        driver.manage().window().maximize();

        WebElement FirstName= driver.findElement(By.id("label[for='form-field-email']"));
        FirstName.click();
        FirstName.sendKeys("Asim Bey");

//        WebElement email= driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
//        email.click();
//        email.sendKeys("asimby@gmail.com");
//
//        WebElement currentAdress=driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
//        currentAdress.sendKeys("Ontario, London");
//
//        WebElement permanenAdress=driver.findElement((new By.ByCssSelector(".form-control[id='permanentAddress']")));
//        permanenAdress.sendKeys("Canada");
//
//        WebElement  submit=driver.findElement((new By.ByCssSelector(".btn-primary[id='submit']")));
//         submit.click();
//
//
//        System.out.println("-----------");
//
//        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
//        String name=nameText.getText();
//        System.out.println(name);
    }
}
