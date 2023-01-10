package C017;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import static C011_utils.BaseClass.*;

public class _08_WaitFromBaseClass {
    public static void main(String[] args) {
        setUp("https://omayo.blogspot.com");

        driver.findElement(By.cssSelector("button[class='dropbtn']")).click();

        try {
            driver.findElement(By.partialLinkText("Face")).click();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("Element is not found. Please wait longer for the visibility of the element.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Element is not found.");
        }

        tearDown();
    }
}
