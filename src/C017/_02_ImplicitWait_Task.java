package C017;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import java.time.Duration;

import static C011_utils.BaseClass.*;

/**
 *  Task: Get the text from a link which will load a paragraph when you click on it.
 *    1. Go to this URL: http://uitestpractice.com/Students/Contact
 *    2. Click on the link where it says 'This is an Ajax link'
 *    3. First use without wait, handle the exception, should say "Element is not found, Please wait longer for element to become visible".
 *    4. Wait for its content to load and retrieve the text from it and print it to the console.
 *
 */
public class _02_ImplicitWait_Task {
    public static void main(String[] args) {
        setUp("http://uitestpractice.com/Students/Contact");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15)); // This is a GLOBAL wait. Applies to entire elements in the class.

        try {
            driver.manage().window().maximize();
            driver.findElement(By.linkText("This is a Ajax link")).click();
            System.out.println(driver.findElement(By.className("ContactUs")).getText());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found. Wait longer for the element to become visible on the UI ");
        }
        tearDown();
    }
}
