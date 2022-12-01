package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
//                Assert.assertEquals(totalAmount,"66.93");
            }

            @Test
            public void validate_Cart_Total() throws InterruptedException {
                driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
                Thread.sleep(2000);
                driver.findElement(By.className("shopping_cart_link")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("checkout")).click();
                Thread.sleep(2000);
                driver.findElement(By.id("first-name")).sendKeys("test");
                Thread.sleep(2000);
                driver.findElement(By.id("last-name")).sendKeys("test2");
                Thread.sleep(2000);
                driver.findElement(By.id("postal-code")).sendKeys("9999");
                Thread.sleep(2000);
                driver.findElement(By.id("continue")).click();
                Thread.sleep(2000);
                WebElement totalAmount =driver.findElement(By.xpath("//div[@class='summary_total_label']"));



            }

    }

