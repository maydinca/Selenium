package C016;

import org.openqa.selenium.By;

import java.util.Iterator;
import java.util.Set;

import static C011_utils.BaseClass.*;

public class _03_WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        setUp("https://demoqa.com/browser-windows");


        String parentWindowTitle = driver.getTitle();
        System.out.println("parentWindowTitle :"+parentWindowTitle);
        String parentWindow= driver.getWindowHandle();
        System.out.println("parentWindow ID: = " + parentWindowTitle);


        for (int i = 0; i < 3; i++) {
            driver.findElement(By.id("tabButton")).click();
            Thread.sleep(1000);
        }

        Set<String> allwindows=driver.getWindowHandles();

        for(String windowOrTab :allwindows){
            driver.switchTo().window(windowOrTab);

            driver.get("https://google.com");
            System.out.println("Window ID :"+windowOrTab +"Title :"+ driver.getTitle());
           Thread.sleep(1000);

        }

        //with iterator
        System.out.println("***************");

        Iterator<String>iterator=allwindows.iterator();
        while(iterator.hasNext()){
            String windowOrTab=iterator.next();
            driver.switchTo().window(windowOrTab);
            System.out.println("window ID = " + windowOrTab+"URL ="+driver.getCurrentUrl());
        }


        tearDown();
    }
}
