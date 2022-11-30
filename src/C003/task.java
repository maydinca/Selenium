package C003;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task {
     /**

        Open the chrome browser
        Nagigate to https://www.exelenter.com
        Nagigate to https://www.google.com

        Nagigate to exelenterpage
        refresh the current page

        Verify URL contains "Exelenter"
        close browser

         */
     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.exelenter.com");



         driver.navigate().to("https://www.google.com");
         driver.navigate().back();
         driver.navigate().refresh();

         if (driver.getCurrentUrl().contains("exelenter")){
             System.out.println("Pass. URL does contain word \"exelenter\" ");

         }else {
             System.out.println("Fail. URL does not contain word \"exelenter\" ");
         }

             //another way to verify
             boolean exelenter =driver.getCurrentUrl().contains("exelenter");
             System.out.println(exelenter); // if pass =true

             driver.close();
         }

     }


