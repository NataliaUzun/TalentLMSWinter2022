import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomeWorkArrayTest {
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testErlan() {
        int[] array = {1, 2, 11, 3, 4};
        int result = HomeWorkArray.array11(array, 0);
        softAssert.assertEquals(result, 1);
        softAssert.assertAll();
    }
}