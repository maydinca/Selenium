package C014;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static C011_utils.BaseClass.*;

public class _01_AlertDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://selenium08.blogspot.com/2019/07/alert-test.html");  // switch to URL:

        // How to handle a simple alert
        WebElement simpleAlert = driver.findElement(By.id("simple"));
        simpleAlert.click();
        Thread.sleep(2000);

        // Question: What happens when we try to click on another element without handling an ALERT first?
                // driver.findElement(By.xpath("//div[text()='Search']")).click();
                // Answer: You will get "UnhandledAlertException" if you don't handle alert before doing anything else.

        Alert alert = driver.switchTo().alert();             // We switch the focus of the web browser to the alert window
        String alertText = alert.getText();                  // I am storing the text from the Alert in a String var.
        System.out.println("alertText: " + alertText);
        alert.accept();                                      // accept = OK


        // Handling Confirmation Alert
        driver.findElement(By.cssSelector("button#confirm")).click();
        Alert confirmationAlert= driver.switchTo().alert();         // Note: For all alert types we use the same .switchTo().alert();
        String confirmationAlertText = confirmationAlert.getText();
        System.out.println("confirmationAlertText: " + confirmationAlertText);
        Thread.sleep(2000);
        confirmationAlert.dismiss();                        //dismiss = 'Cancel' button


        // Handling Prompt Alert

        driver.findElement(By.id("prompt")).click();               //identify webElement for the Alert and click on it
        Alert promptAlert =driver.switchTo().alert();              //Switching to Alert (from the browser) to handle it
        String promptAlertText=promptAlert.getText();              //Get the content /text of the Alert
        System.out.println("promptAlertText : " + promptAlertText);
        Thread.sleep(2000);                                  // Add time only when needed. This is totally optional
        promptAlert.sendKeys("Mehmet");                  // I am sending text/value into the input text box
        promptAlert.accept();                                      //Press ok button to close the alert


        //Lets verify our entered text

       // System.out.println(driver.findElement(By.xpath("//div[contains(text(),'Mehmet')]")).getText(); //in one line
        String enteredText = driver.findElement(By.xpath("//div[contains(text(),'Mehmet')]")).getText();
        System.out.println("enteredText : "+enteredText);

        String expectedText ="Mehmet";  //Negative Testing is "Happy Path Testing"

        if(enteredText.contains(expectedText)) {
            System.out.println("Text is added successfully.Test Passed.");

        } else {
            System.err.println("Text is not added successfully.Test failed.");
        }
        tearDown();
    }
}
