package C017;

public class varExample {

    public static void main(String[] args) {
        // _06_FluentWaitWebDriverSomething01 fluentWait = new _06_FluentWaitWebDriverSomething01();
        var fluentWait = new varExample(); // This and one above is the same.
        fluentWait.printHello();
    }


    public void printHello() {
        System.out.println("Hello");
    }
}
