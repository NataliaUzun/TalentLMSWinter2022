import Recurtion2.GroupSum;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Recurtion2.GroupSum.groupSum;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class GroupSumTest {

    @Test
    public void testGroupSum() {
        int[] nums = {2, 4, 8};
        assertTrue(groupSum(0, nums, 10));
        assertTrue(groupSum(0, nums, 14));
        assertFalse(groupSum(0, nums, 9));
    }
}

