package C007;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_RadioDemo {
    private static String url = "https://formstone.it/components/checkbox/";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        //Find the checkbox 'three' and verify if it is enabled or not.
        WebElement checkboxThree=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        boolean checkBoxThreeEnabled=checkboxThree.isEnabled();
        System.out.println("checkBoxThreeEnabled = " + checkBoxThreeEnabled);

        boolean checkboxThreeSelected= checkboxThree.isSelected();
        System.out.println("checkboxThreeSelected = " + checkboxThreeSelected);

        boolean checkboxThreeDisplayed= checkboxThree.isDisplayed();
        System.out.println("checkboxThreeDisplayed = " + checkboxThreeDisplayed);


        boolean isSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
        System.out.println("isSelected = " + isSelected);


        WebElement checkboxOne=driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
        boolean checkboxOneEnabled=checkboxOne.isEnabled();
        System.out.println("checkboxOneEnabled = " + checkboxOneEnabled);


        Thread.sleep(2000);
        driver.close();
    }
}
