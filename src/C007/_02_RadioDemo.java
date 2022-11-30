package C007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_RadioDemo {
    private static String url = "https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

//        WebElement mozillaElementIcon= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
//        mozillaElementIcon.click();
//
//        Boolean isSelected=mozillaElementIcon.isSelected();
//        System.out.println(isSelected);


        //Go to given website, find Mozilla radio button and click on it.
//        driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();

        //Go to given website,find Mozilla radio button from the list and verify if it is 1. Displayed,2.Enabled,3.Selected.
        boolean displayed=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isDisplayed();
        boolean Enabled=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isEnabled();
        boolean Selected=driver.findElement(By.xpath("(//input[@type='radio'])[2]")).isSelected();

        System.out.println("displayed : "+displayed);
        System.out.println("Enabled   : "+Enabled);
        System.out.println("Selected  : "+Selected);

        boolean isSelected = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
        System.out.println("isSelected = " + isSelected);

        Thread.sleep(2000);
        driver.close();
    }
}
