package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//
//        WebDriver driver= new ChromeDriver();
//
//        driver.get ("https://demoqa.com/text-box");
//        driver.manage().window().maximize();
//
//        WebElement fullName= driver.findElement(By.id("userName"));
//        fullName.click();
//        fullName.sendKeys("Asim Bey");
//
//        WebElement email= driver.findElement(new By.ByCssSelector(".mr-sm-2[id='userEmail']"));
//        email.click();
//        email.sendKeys("asimby@gmail.com");
//
//    WebElement currentAdress=driver.findElement(new By.ByCssSelector(".form-control[placeholder='Current Address']"));
//    currentAdress.sendKeys("Ontario, London");
//
//    WebElement permanenAdress=driver.findElement((new By.ByCssSelector(".form-control[id='permanentAddress']")));
//    permanenAdress.sendKeys("Canada");
//
//    WebElement  submit=driver.findElement((new By.ByCssSelector(".btn-primary[id='submit']")));
//    submit.click();
//
//
//        System.out.println("-----------");
//
//        WebElement nameText=driver.findElement(By.xpath("//div/p[@id='name']"));
//        String name=nameText.getText();
//        System.out.println(name);

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get ("https://demoqa.com/checkbox");
        driver.manage().window().maximize();


        String homeCheckboxSccValue= "label[for='tree-node-home'] span.rct-checkbox svg";
        WebElement homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckboxSccValue));
        homeCheckBox.click();

        homeCheckBox=driver.findElement(new By.ByCssSelector(homeCheckboxSccValue));
        String homeCheckBoxClassName=homeCheckBox.getAttribute("class");


        if(homeCheckBoxClassName.equals("rct-icon rct-icon-check")){
            System.out.println("Checkbox is Checked!");
        }else {
            System.out.println("Checkbox is UnChecked!");
        }

    }
}