package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQAOrnek {
    private static String url = "https://demoqa.com/";
    private static String fullName = "Test Ediyorum";
    private static String email = "TestEdiyorum@gmail.com";
    private static String currentAdress = "TestEdiyorum street Canada";
    private static String permanetAdress = "TestEdiyorum kalici street Canada";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement elementIcon = driver.findElement(By.xpath("//*[@fill='currentColor']"));
        elementIcon.click();
        Thread.sleep(2000);
        WebElement textBoxIcon = driver.findElement(By.xpath("//*[contains(text(),'Text Box')] [@class='text']"));
        textBoxIcon.click();

        //filloutTheForm
        driver.findElement(By.xpath("//*[@placeholder='Full Name']")).sendKeys(fullName);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#userEmail")).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@placeholder='Current Address']")).sendKeys(currentAdress);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#permanentAddress")).sendKeys(permanetAdress);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#submit")).click();
        Thread.sleep(2000);

        ///text alma

        WebElement nameText = driver.findElement(By.cssSelector("#name"));
        String recordedName = nameText.getText();
        System.out.println(recordedName);

        System.out.println("------------");

        WebElement emailText = driver.findElement(By.cssSelector("#email"));
        String recordedEmail = emailText.getText();
        System.out.println(recordedEmail);


        //checkBox
        WebElement checkboxIcon = driver.findElement(By.xpath("//span[@class='text'][contains(text(),'Check Box')]"));
        checkboxIcon.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-expand-close\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class=\"rct-icon rct-icon-expand-all\"]")).click();
        Thread.sleep(2000);


        String homeCheckBoxValue = "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxValue));
//        homeCheckBox.click();

        homeCheckBox = driver.findElement(new By.ByCssSelector(homeCheckBoxValue));
        String homeCheckBoxClassName = homeCheckBox.getAttribute("class");
        System.out.println("home Check Box Class Name : " + homeCheckBoxClassName);

        if (homeCheckBoxClassName.equals("rct-icon rct-icon-check")) {
            System.out.println("Checkbox is checked!");
        } else {
            System.out.println("Checkbox is not checked!");

            Thread.sleep(5000); //bunun yerine kullanilani bul

//        driver.close();
        }
    }
}
