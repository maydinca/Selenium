package C005;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssDemo {
    private static String url="https://exelentersdet.com/";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        Thread.sleep(2000);

//XPATTH ---->CSSSELECTOR
//        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");

        driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
                Thread.sleep(2000);

//        driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys("Exelent2022Sdet!");
//        driver.findElement(By.xpath("//*[@id=\"txtPassword\"]")).sendKeys("Exelent2022Sdet!");
        driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Exelent2022Sdet!");
        Thread.sleep(2000);

        //login
//        driver.findElement(By.xpath("//input[@name='Submit']")).click();
//        driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
        driver.findElement(By.cssSelector(".button")).click();
        Thread.sleep(2000);

//        driver.findElement(By.xpath("//a[contains(text (),'Welcome')]")).click();
        driver.findElement(By.cssSelector("a[id='welcome']")).click();
                                            //.panelTrigger#welcome
                                 //a[contains (text(), 'Welcome Admin')]

        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#welcome-menu a")).click();
//        driver.close();

    }
}
