package Ornekler_00;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class youTube {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.youtube.com");
        Thread.sleep(2000);


        WebElement searchElement= driver.findElement(By.xpath("//input[@id='search']"));
//        WebElement searchElement= driver.findElement(By.cssSelector("input.ytd-searchbox[name='search_query']"));
//        WebElement searchElement=driver.findElement(By.id("search"));
        Thread.sleep(2000);
//        searchElement.click();
//        searchElement.sendKeys("kitaro");
//        driver.navigate().to("https://www.youtube.com/watch?v=SyPbn-hjfWg");
//        driver.manage().window().maximize();
//        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]"));
        WebElement searchButton = driver.findElement(By.xpath("//*[@id='search-icon-legacy']"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement searchBestSong= driver.findElement(By.partialLinkText("Best KITARO"));
        searchBestSong.click();
        driver.manage().window().maximize();


        WebElement KITAROBestSongs = driver.findElement(By.partialLinkText("KITARO Best Songs"));
//     WebElement yazi= new KITAROBestSongs.getText();
//        System.out.println("Choice is = " + KITAROBestSongs);
////        Assert.isTrue("KITARO Best Songs".equals(KITAROBestSongs), "Wrong Page");
    }
}
