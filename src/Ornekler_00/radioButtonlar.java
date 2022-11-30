package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radioButtonlar {

    private static String url = "https://demoqa.com/elements";
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get(url);
//        WebElement elementIcon= driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div/div[1]/div/div[2]/svg"));
        Thread.sleep(2000);
//        elementIcon.click();

        WebElement radioButton= driver.findElement(By.xpath("//*[contains(text(),'Radio Button')]"));
        Thread.sleep(2000);
        radioButton.click();
        driver.manage().window().maximize();


        WebElement yesButtonLabel= driver.findElement(By.cssSelector ("label[for='yesRadio']"));
        boolean isEnabled=yesButtonLabel.isEnabled();

        if (isEnabled){
            yesButtonLabel.click();
            System.out.println("Yes button is clicked.");
        }


        WebElement yesRadioButton= driver.findElement(By.id("yesRadio"));
        Boolean isSelected=yesRadioButton.isSelected();
        if (isSelected){
            System.out.println("Yes radio button is selected");
        }

        WebElement outPut= driver.findElement(By.cssSelector ("p.mt-3"));
        String outPutText=outPut.getText();
        System.out.println(outPutText);

        WebElement noRadioButton= driver.findElement(By.cssSelector ("#noRadio"));
        System.out.println(noRadioButton.isEnabled());





    }
}
