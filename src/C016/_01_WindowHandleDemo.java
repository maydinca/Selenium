package C016;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static C011_utils.BaseClass.*;

public class _01_WindowHandleDemo {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://the-internet.herokuapp.com/windows");

        /**
         * How to handle new TABS and new WINDOW in Selenium?
         * We have two methods for handling  new tabs/ windows.
         * 1. getWindowHandle(); =====> handles main window only
         * 2.getWindowHandle() ; =========> handles All windows (or tabs)
         *
         */

        String mainWindowTitle = driver.getTitle();
        System.out.println("mainWindowTitle = " + mainWindowTitle);


        String windowHandle = driver.getWindowHandle();     //this will return parent's window unique ID
        System.out.println("windowHandle = " + windowHandle);


        driver.findElement(By.linkText("Click Here")).click();
//        driver.findElement(By.linkText("Click Here")).click();
//        driver.findElement(By.linkText("Click Here")).click();


        //Focus is still in the main/ parent window, because we have not switched to the child window yet.
        // System.out.println(driver.getTitle());  //Which window title will print here?


        Set<String> allWindows =driver.getWindowHandles(); //this will return unique IDs for All windows
        int allOpenWindows=allWindows.size();
        System.out.println("All tabs currently open :  = " + allOpenWindows);


        System.out.println("=====================");
        System.out.println(allOpenWindows);
        allWindows.forEach(System.out::println);            //<---------use forEach() - If you want to print them all on each new line

        //Here comes your iterator skills - put them in good use
        Iterator<String> iterator =allWindows.iterator();
        String mainWindow =iterator.next();
        String childWindow =iterator.next();
        System.out.println("mainWindow = " + mainWindow);
        System.out.println("childWindow = " + childWindow);


        System.out.println(driver.getTitle());          //Which window will print here?
        Set<String> windowHandles =driver.getWindowHandles();

        //How to switch focus to the child window and print its title
        driver.switchTo().window(childWindow);

        System.out.println("Get title after the swith: "+ driver.getTitle());

       // if I call driver.close() in this line, which window / tab will close?

        Thread.sleep(2000);
        driver.close();             //it should close child,because as of this line FOCUS is on the child






        tearDown();


    }
}
