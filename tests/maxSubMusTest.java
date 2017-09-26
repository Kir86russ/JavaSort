import org.junit.Test;

import static org.junit.Assert.*;


public class maxSubMusTest {
    maxSubMus mSM = new maxSubMus();
    int[] ar = {1, 4, 6, 2, 10, 12};

    @Test
    public void maxSub() {
        assertEquals(0 + " " + 5 + " " + 35, mSM.maxSubMus(ar));
    }
}
