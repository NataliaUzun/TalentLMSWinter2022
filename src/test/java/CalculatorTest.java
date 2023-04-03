import com.digital.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CalculatorTest {

    SoftAssert softAssert = new SoftAssert();
    @Test
    public void addTwoNumsTest(){
        Assert.assertEquals(Calculator.add(2,2),4);
        System.out.println("1");
        Assert.assertEquals(Calculator.add(2,2),3);
        System.out.println("2");
        Assert.assertEquals(Calculator.add(2,3),5);
        System.out.println("3");
        Assert.assertEquals(Calculator.add(2,3),5);
        System.out.println("4");
        Assert.assertEquals(Calculator.add(2,3),5);
        System.out.println("15");
    }

    @Test
    public void testSoftAssert(){
        softAssert.assertEquals(Calculator.add(2,2),4);

        softAssert.assertEquals(Calculator.add(2,2),5);

        softAssert.assertEquals(Calculator.add(2,2),6);

        softAssert.assertEquals(Calculator.add(2,2),7);

        softAssert.assertEquals(Calculator.add(2,2),8);

        softAssert.assertAll();
    }
    @Test
    public void testAssertTrue(boolean funny){
        testAssertTrue(SomeClass.isFunny(true));

    }
}