import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertNotNull;

public class SomeClass {
    public static boolean isFunny(boolean param){
        if (param);
        return false;
    }
    @Test
    public void testAssertTrue(){
        assertTrue(SomeClass.isFunny(true));
        assertFalse(false);
    }

    @Test
    public void test123(){

        Object obj = null;

        assertNotNull(null);
    }
}
