package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ornek4abdulhamid {

            static WebDriver driver;

            @BeforeMethod
            public void initialize_driver(){
                System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://www.saucedemo.com");
                driver.manage().window().maximize();
                driver.findElement(By.id("user-name")).sendKeys("standard_user");
                driver.findElement(By.id("password")).sendKeys("secret_sauce");
                driver.findElement(By.id("login-button")).click();
            }

            @Test
            public void validate_Title_and_URL(){
                String currentUrl = driver.getCurrentUrl();
                String title = driver.getTitle();

                Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html");
                Assert.assertTrue("swag labs".equalsIgnoreCase(title));
            }

            @Test
            public void validate_Cart_Total(){
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
                driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
                driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
                driver.findElement(By.className("shopping_cart_link")).click();
                driver.findElement(By.id("checkout")).click();
                driver.findElement(By.id("first-name")).sendKeys("John");
                driver.findElement(By.id("last-name")).sendKeys("Smith");
                driver.findElement(By.id("postal-code")).sendKeys("07650");
                driver.findElement(By.id("continue")).click();

            }

    }

