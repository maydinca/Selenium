package C013;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static C011_utils.BaseClass.driver;
import static C011_utils.BaseClass.setUp;

/**
 * There are 3 ways we can utilize existing methods of another cass inside current class
 * 1- By using 'extends BaseClass'
 * 2-By accessing through class name such as 'BaseClass.setUpO;
 * 3-By static import - 'import static utils.BaseClass'
 */
public class DropdownDemo {

    public static void main(String[] args) throws InterruptedException {
        setUp();
        //1st way: without using Select class
        List<WebElement> countries = driver.findElements(By.xpath("//select[@name='country']/option"));
        for (WebElement country : countries) {
            System.out.println(country.getText());

        }
        //2 nd way: Using the select class provided by Selenium
        WebElement countryDD = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDD);

        //get the size of the dropdown
        List<WebElement> countriesDD = select.getOptions();
        System.out.println("Total number of Countries: " + countriesDD.size());


        //Loop through all countries using their index
        for (WebElement country : countries) {
            if (country.getText().equals("Turkey"))
                country.click();
            break;
        }
    }
//            country.click();
//            Thread.sleep(50);


//            for (int i = 0; i <countries.size() ; i++) {
//                countries.get(i).click();
//                Thread.sleep(500);


}



