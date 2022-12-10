//package Mentoring;
//
//import org.openqa.selenium.WebElement;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class December6 {
//    public static List<String> getListOfWebElements(List<WebElement> webElementList) {
//        List<String> stringList = new ArrayList<>();
//        for (int i = 0; i < webElementList.size(); i++) {
//
//
////            System.out.println(webElementList.get(i));
////            System.out.println(webElementList.get(i).getText());
//            stringList.add(webElementList.get(i).getText());
//        }
//        return stringList;
//    }
//}
//
//    public static int randomNumberGenerator(int n){
//        return new Random().nextInt(n);  //5
//    }
//
//    public static int getIndexOfSelectedItem(List<WebElement> list, String element){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getText().equalsIgnoreCase(element)) return i;
//        }
//        return -1;
//    }
//
//    public static void selectRandomProduct(List<WebElement> itemList, int randomIndex){
//        itemList.get(randomIndex).click();
//    }
//
//    @Test
//    public static void clickRandomMeuItem(){
//        List<WebElement> menuWebElementList = driver.findElements(By.xpath("//*[@data-ui='top-nav-category-list']//li"));
//        List<String> menuStringList = getListOfWebElements(menuWebElementList); // index start from 0 till list.size()
//        int randomIndex = randomNumberGenerator(menuWebElementList.size());
//        String randomElement = menuStringList.get(randomIndex);
//        String randomWebElement = menuWebElementList.get(randomIndex).getText();
//        System.out.println("randomIndex = " + randomIndex);
//        System.out.println("randomElement = " + randomElement);
//        System.out.println("randomWebElement = " + randomWebElement);
//
//        int itemIndex = getIndexOfSelectedItem(menuWebElementList, randomElement);
//        selectRandomProduct(menuWebElementList, randomIndex);
//
//        Assert.assertEquals(randomElement, randomWebElement);
//        Assert.assertEquals(menuWebElementList.size(), menuStringList.size());
//        Assert.assertEquals(randomIndex, itemIndex);
//
//    }
//    @Test
//    public static void clickRandomMeuItem(){
//        List<WebElement> menuWebElementList = driver.findElements(By.xpath("//*[@data-ui='top-nav-category-list']//li"));
//        List<String> menuStringList = getListOfWebElements(menuWebElementList); // index start from 0 till list.size()
//        int randomIndex = randomNumberGenerator(menuWebElementList.size());
//        String randomElement = menuStringList.get(randomIndex);
//        String randomWebElement = menuWebElementList.get(randomIndex).getText();
//        System.out.println("randomIndex = " + randomIndex);
//        System.out.println("randomElement = " + randomElement);
//        System.out.println("randomWebElement = " + randomWebElement);
//
//        int itemIndex = getIndexOfSelectedItem(menuWebElementList, randomElement);
//        selectRandomProduct(menuWebElementList, randomIndex);
//
//        Assert.assertEquals(randomElement, randomWebElement);
//        Assert.assertEquals(menuWebElementList.size(), menuStringList.size());
//        Assert.assertEquals(randomIndex, itemIndex);
//
//    }
//
//    public static List<String> getListOfWebElements(List<WebElement> webElementList){
//        List<String> stringList = new ArrayList<>();
//        for (int i = 0; i < webElementList.size(); i++) {
////            System.out.println(webElementList.get(i));
////            System.out.println(webElementList.get(i).getText());
//            stringList.add(webElementList.get(i).getText());
//        }
//        return stringList;
//    }
//    public static int randomNumberGenerator(int n){
//        return new Random().nextInt(n);  //5
//    }
//
//    public static int getIndexOfSelectedItem(List<WebElement> list, String element){
//        for (int i = 0; i < list.size(); i++) {
//            if (list.get(i).getText().equalsIgnoreCase(element)) return i;
//        }
//        return -1;
//    }
//
//    public static void selectRandomProduct(List<WebElement> itemList, int randomIndex){
//        itemList.get(randomIndex).click();
//    }