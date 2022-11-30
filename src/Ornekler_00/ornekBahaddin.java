//package Ornekler_00;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.Random;
//
///*Scenario Login to exelentersdet.com
// * 1.User  launch Chrome browser
// * 2.User navigate to "https://exelentersdet.com/symfony/web/index.php/auth/login"
// * 3.User verify exelenter login page
// * 4.User enters username
// * 5.User enters password
// * 6.User click to login in
// * 7.User verifies successfully logged in*/
//
//public class ornekBahaddin {
//    public static void main(String[] args) throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://exelentersdet.com");
//        Thread.sleep(2000);
//        driver.switchTo().newWindow(WindowType.TAB);
//        driver.navigate().to("https://exelentersdet.com/symfony/web/index.php/auth/login");
//        Thread.sleep(2000);
//        driver.manage().window().maximize();
//
//        String title ="Exelenter Project";
////        try{
////            title.equals(driver.getTitle());
////            System.out.println("Succesfully verified login");
////        }catch (Exception exception){
////            System.out.println("Error. verify your credentials");
////        }
////
////        //we are locating username and fill in with the 'username' text
////        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
////        Thread.sleep(2000);
////        //user pasw
////
////        driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Exelent2022Sdet!");
////        Thread.sleep(2000);
////
////        //login
////        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
////        Thread.sleep(2000);
////
////        String logIn= "Welcome Admin";
////
////        boolean dispayed= driver.findElement(By.xpath("//*[contains(text (),'Welcome Admin')]")).isDisplayed();
////        try {
////            boolean loggedIn=dispayed;
////            System.out.println("Successfully Looed in");
////
////
////        }catch (Exception ex){
////            System.out.println("Please verify your credentials");
////        }
////    driver.close();
//    String s = generateEmail();
//    System.out.println(s);
//
////        //In order to verify we are logged in, thetr id a message top right corner of the dashboardon the 'Welcome Admin'-
////               driver.findElement(By.xpath("//*[contains(text (),'Welcome Admin')]")).click();
////        Thread.sleep(2000);
////        System.out.println("");
//
//        public static String generateEmail(){
//            Random random   =new Random();
//
//            String email="";
//            for (int i = 0; i <7 ; i++) {
//                int charRandom= random.nextInt(97,124);
//                email+=(char)charRandom;
//
//
//            }
//            return email+ "@gmail.com";
//        }
//    }
//}
