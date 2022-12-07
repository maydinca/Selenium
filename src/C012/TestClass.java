package C012;

import C011_utils.BaseClass;
//import static C011_utils.BaseClass.* extend yerine bunu da kullanabiliriz.
public class TestClass extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        setUp();                                        //<---Launch the browser
        System.out.println( driver.getTitle());         //<---Perform an action on the browser (Actual testing)
        tearDown();                                     //<---Quit the browser.
    }
}
