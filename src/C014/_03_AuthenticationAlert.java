package C014;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _03_AuthenticationAlert {
    //setUp("https:/foo:bar@httpbin.org/basic-auth/foo/bar");

    /**
     * 1. JS Alert types
     * 2. Modal (HTML based) popup types
     * 3. Basic Authentication Alert type
     * 4. Windows based popups (Not supported by Selenium)
     *
     * For above website:
     * Username=foo
     * Password= bar
     *
     *
     */



//    tearDown();
//}
//}
    private static String url="https:/foo:bar@httpbin.org/basic-auth/foo/bar";
    public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe"); // window users add '.exe' at the end
    WebDriver driver = new ChromeDriver();
        driver.get(url);

}
}