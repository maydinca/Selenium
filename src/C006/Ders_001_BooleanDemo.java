package C006;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ders_001_BooleanDemo {
    private static String url = "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx";
    private static String user="Tester";
    private  static String password="test";
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement username = driver.findElement(By.cssSelector("input[type='text']"));
        username.sendKeys("deneme");
        Thread.sleep(2000);
        username.clear();
        username.sendKeys(user);
        Thread.sleep(2000);

        WebElement userPassword = driver.findElement(By.cssSelector("input[type='password']"));
        userPassword.sendKeys(password);
        Thread.sleep(2000);

        WebElement logIn = driver.findElement(By.cssSelector("input[value='Login']"));
        logIn.click();   //logIn.submit should be worked.

        //Once we are on the dashboard,lets verify it using an element from the dashboard page
        WebElement webOrdersLogo = driver.findElement(By.xpath("//h1[text()='Web Orders']"));
        boolean logoDisplayed = webOrdersLogo.isDisplayed();

        if (logoDisplayed) {
            System.out.println("Logo is displayed.Test case passed");
        } else {
            System.out.println("Logo is not displayed.Test case failed");

        }
        //identify logged in user on the dashboard.
        WebElement loggedInUser = driver.findElement(By.cssSelector("div.login_info"));
        String loggedInUserText=loggedInUser.getText();
        System.out.println(loggedInUserText);

        String expectedLoggedInUserText= "Welcome, Tester! | Logout";

        if(loggedInUserText.equals(expectedLoggedInUserText)){
            System.out.println("Authorized user is able to login successfully.Test Passed.");

//        if(loggedInUserText.contains(("Tester"))){
//            System.out.println("Authorized user is able to login successfully.Test Passed.");

        }else{
            System.out.println("Authorized user is NOT able to login successfully.Test failed.");
        }

        Thread.sleep(2000);
        driver.close();
        }
    }









