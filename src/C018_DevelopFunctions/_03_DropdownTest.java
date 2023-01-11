package C018_DevelopFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static C011_utils.BaseClass.*;

public class _03_DropdownTest {
    public static void main(String[] args) {
        setUp("https://selenium08.blogspot.com/2019/11/dropdown.html");

        String expectedText="June";
        List<WebElement> listofMonths = driver.findElements(By.xpath("//*[@name='Month']/option"));
        for(WebElement month:listofMonths){
            String actualText = month.getText();
            if (actualText.equals(expectedText));
            month.click();
        }

        tearDown();

    }
    // Task: HW Take this logic and put it inside its own independent method just like we did with RadioOrCheckbox
}
