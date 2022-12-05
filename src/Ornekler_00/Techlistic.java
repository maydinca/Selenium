package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Techlistic {
    private static String url = "https://www.techlistic.com/p/selenium-practice-form.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        driver.findElement(By.name("firstname")).sendKeys("Test");
        Thread.sleep(500);
        driver.findElement(By.name("lastname")).sendKeys("Test2");
        Thread.sleep(500);
        driver.findElement(By.id("sex-0")).click();
        Thread.sleep(500);

        List<WebElement> yearsOfExperience = driver.findElements(By.xpath("(//*[@class='control-group'])[5]/input"));
        for (int i = 0; i < yearsOfExperience.size(); i++) {
            yearsOfExperience.get(i).click();
            Thread.sleep(500);

        }
        Thread.sleep(500);

        //(//*[@class='control-group'])[5]/input)

        //date
        driver.findElement(By.cssSelector("input[id='datepicker'")).sendKeys("2022-12-04");
        Thread.sleep(500);
        //(//*[@class='control-group'] [6])/input

        List<WebElement> professions = driver.findElements(By.xpath("(//*[@class='control-group'] [6])/input"));
        for (int i = 0; i < professions.size(); i++) {
            professions.get(i).click();
            Thread.sleep(500);
        }

        //Thread.sleep(500);
        //driver.findElement(By.cssSelector("input[id='tool-2'")).click();
        Thread.sleep(500);
        //driver.findElement(By.xpath("(//select[@class='input-xlarge'])[1]")).click();
        Thread.sleep(500);

        //tek sec
        //driver.findElement(By.cssSelector("tool-2")).click();


        //*[text()='North America']
        //driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();


        //automation tools

        List<WebElement> tools = driver.findElements(By.xpath("(//div[@class='control-group'])[7]//input"));

        for (WebElement tool : tools) {
            tool.click();
            Thread.sleep(500);
        }

        //Continents

        WebElement continents = driver.findElement(By.cssSelector("select[id='continents']"));

        Select cnt = new Select(continents);

        cnt.selectByVisibleText("North America");


        //selenium Commands has been chosen

        continents = driver.findElement(By.cssSelector("#selenium_commands"));


        cnt = new Select(continents);
        cnt.selectByIndex(2);
        cnt.selectByIndex(4);


        Thread.sleep(2000);
    }
}