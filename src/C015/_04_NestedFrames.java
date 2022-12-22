package C015;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static C011_utils.BaseClass.*;
public class _04_NestedFrames {
    public static void main(String[] args) {
        setUp("https://ui.vision/demo/webtest/frames/");                //

        WebElement frame3 = driver.findElement(By.cssSelector("frame[src='frame_3.html']"));
        driver.switchTo().frame(frame3);
        driver.findElement(By.name("mytext3")).sendKeys("Frame Three");


        //Print



        tearDown();


    }
}
