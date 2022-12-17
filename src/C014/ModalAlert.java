package C014;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static C011_utils.BaseClass.*;

public class ModalAlert {
    public static void main(String[] args) {
    setUp();  //https://demoqa.com/modal-dialogs

        WebElement modalAlert = driver.findElement(By.cssSelector("#showSmallModal")); // find web element for modal alert type (HTML based alert ) and store it
        modalAlert.click();                         //click to trigger (lunch) it
        System.out.println(modalAlert.getText());   //Retrieving the text of Modal dialog (WebElement itself)


        //Print in two lines (Title of Modal)

        WebElement modalBody = driver.findElement(By.xpath("//*[@class='modal-body']"));
        System.out.println(modalBody.getText());

        driver.findElement(By.xpath("//button[text()='Close']")).click(); // I am closing the modal by clicking the close button
        tearDown();
}
}