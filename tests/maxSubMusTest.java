import org.junit.Test;


import static org.junit.Assert.*;


public class maxSubMusTest {
    maxSubMus mSM = new maxSubMus();
    int[] ar = {1, 4, 6, 2, 10, 12};
    int[] ar2 = {15, -21, -11, 0};
    int[] ar3 = {-4, -4, 0, 1, -1};
    int[] ar4 = {0, 1, 2, 3, 100, 1000, -1000, 100};


    @Test
    public void maxSub() {
        assertArrayEquals(mSM.maxSubMus(ar), new int[]{0, 5, 35});
        assertArrayEquals(mSM.maxSubMus(ar2), new int[]{0, 0, 15});
        assertArrayEquals(mSM.maxSubMus(ar3), new int[]{2, 3, 1});
        assertArrayEquals(mSM.maxSubMus(ar4), new int[]{0, 5, 1106});

    }
}
