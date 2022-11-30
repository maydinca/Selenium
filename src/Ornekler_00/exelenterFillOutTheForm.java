package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exelenterFillOutTheForm {

    public static void main(String[] args) throws InterruptedException {
       System.setProperty("Webdriver.Chrome.driver","/drivers/chromedrivers.exe");
       WebDriver driver =new ChromeDriver();
       driver.get("https://www.exelenter.com");

       String contact ="//a[@href='https://exelenter.com/contact/' and @class='elementor-item' and not(@tabindex='-1')]";
       driver.findElement(By.xpath(contact)).click();
       driver.manage().window().maximize();

       //Fillout
       WebElement firstname=driver.findElement(By.id("form-field-email"));
       firstname.click();
       firstname.sendKeys("Mehmet");
       Thread.sleep(3000);

       driver.findElement(By.id("form-field-field_613ea78")).sendKeys("Aydin");
       Thread.sleep(3000);
       driver.findElement(By.id("form-field-field_bfaa16e")).sendKeys("test@gmail.com");
       Thread.sleep(3000);
       driver.findElement(By.id("form-field-field_ac25300")).sendKeys("123456789");
       Thread.sleep(10000);

       //Submit
        driver.findElement(By.xpath("//*[text()='Consult Today']")).click();

    }
}
