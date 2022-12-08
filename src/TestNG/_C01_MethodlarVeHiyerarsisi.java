package TestNG;

import org.testng.annotations.*;

public class _C01_MethodlarVeHiyerarsisi {
    @BeforeSuite
    public void BeforeSuite() {
        System.out.println("\nBeforeSuite ----Suit ile baslar. Ilk calisan Methoddur.");
    }
    @BeforeTest // Test baslamadan buraya driver bilgileri girilebilir.
    public void BeforeTest() {
        System.out.println("\nBeforeTest ----Suit ten sonra gelir. Testin basinda calisir.");
    }

    @BeforeClass
    public void BeforeClass() {
        System.out.println("\nBeforeClass ---- Before methoddan once, before Test ten sonra calisan method.");
    }
    @BeforeMethod
    public void BeforeMethod() {
        System.out.println("\nBeforeMethod ---- Her test methodundan once Before class tan sonra calisir.");
    }
    @Test
    public void Test1() {
        System.out.println("<Test1>");
    }
    @Test
    public void Test2() {
        System.out.println("<Test2>");
    }
    @AfterMethod
    public void AfterMethod() {
        System.out.println("\nAfterMethod ----" + "Her test methodundan sonra calisir");
    }
}