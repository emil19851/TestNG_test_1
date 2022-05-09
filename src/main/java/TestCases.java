import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {

    @BeforeTest
    void beforeTest() {
        System.out.println("Starting the test...");
    }

    @AfterTest
    void afterTest(){
        System.out.println("Test ending...");
    }

    @Test(priority=1, groups = {"math"})
    void addition() {
        Assert.assertEquals(Calculator.addition(0,1),1);
    }

    @Test(priority=2, groups= {"math"})
    void subtraction() {
        Assert.assertEquals(Calculator.subtraction(5,2),3);
    }

    @Test(priority=4, groups= {"math"})
    void division() {
        Assert.assertEquals(Calculator.division(6, 2), 3);
    }

    @Test(priority=3, groups= {"math"})
    void multiplication() {
        Assert.assertEquals(Calculator.multiplication(6, 2), 12);
    }

    @Test(groups = {"GUI"})
    void welcomeScreen() {
        Calculator.welcomeScreen();
    }
}