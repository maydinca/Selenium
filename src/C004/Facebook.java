package C004;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
        public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.get("https://facebook.com");
                driver.manage().window().maximize();


                WebElement email = driver.findElement(new By.ByCssSelector("input[name='email']"));
                email.click();
                email.sendKeys("test@gmail.com");

                WebElement password = driver.findElement(new By.ByCssSelector("input[placeholder='Password']"));
                password.click();
                password.sendKeys("123456789");

                WebElement  logIn=driver.findElement((new By.ByCssSelector("button[data-testid='royal_login_button']")));
                logIn.click();

                WebElement  fpsw=driver.findElement((new By.ByCssSelector("a._97w4")));
                fpsw.click();
        }
}