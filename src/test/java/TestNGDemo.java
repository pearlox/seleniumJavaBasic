import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGDemo {

    @Parameters({"browser","environment"})
    @Test(groups = {"regression"})
    public void a(String browser, String environment) {
        System.out.println("a");
        System.out.println("Browser : "+browser);
        System.out.println("Environment : "+environment);
    }

    @Test(priority = 1, groups = {"smoke"})
    public void d() {
        System.out.println("d");
    }

    @Test(alwaysRun = true, groups = {"sanity"})
    public void c() {
        System.out.println("c");
    }

    @Test(groups = {"regression","smoke"})
    public void e() {
        System.out.println("e");
        Assert.assertEquals(1,1);
    }

    @Test(groups = {"regression"})
    public void b() {
        System.out.println("b");
        Assert.assertTrue(true);
    }

    @Test
    public void f() {
        System.out.println("f");
    }

    @Test(dependsOnGroups = {"regression.*"})
    public void g() {
        System.out.println("g");
    }

//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("In before method");
//    }
//

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("in before suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("in after suite");
    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("in after method");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("in before test");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("in after test");
//    }
//
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("in before class");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("in after class");
//    }
}
