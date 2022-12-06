package C005;

import C011_utils.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpadDemo_Extend extends Constants {
    private static String url="https://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {

        //we dont need to extend it we can also use Constants.CHROME_DRIVER_PATH or after extend we dont need to use "constand.""

        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        Thread.sleep(2000);
    //user id
        //we are locating username and fill in with the 'username' text
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        Thread.sleep(2000);
        //user pasw
        //we are locating username and fill in with the 'password' text
        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Exelent2022Sdet!");
//        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Exelent2022Sdet!");
        Thread.sleep(2000);

        //login
        //locate and click login button
//        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        Thread.sleep(2000);
    //In order to verify we are logged in, we locate and click on the 'Welcome Admin'- top right corner of the dashboard
//        driver.findElement(By.xpath("//a[contains(text (),'Welcome')]")).click();
        driver.findElement(By.xpath("//*[contains(text (),'Welcome Admin')]")).click();
        Thread.sleep(2000);

        //logout
        //we locate and click on the Logout button.
        driver.findElement(By.xpath("//*[contains(text (),'Logout')]")).click();
                                                  //a[contains(text (),'Logout')]
                                                    //div[@id='welcome-menu']/ul/li/a
                                                   //div[@id='welcome-menu']//a
                                                    //a[starts-with(text(),'Logout')]
                                                    //a[starts-with(@id(),'txt')]
        driver.close();

    }
}
