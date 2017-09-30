public class maxSubMus {

    public static int[] maxSubMus(int[] mus) {
        int res = mus[0];
        int sum = 0;
        int left = 0;
        int right = 0;
        int index = -1;

        for (int i = 0; i < mus.length; i++) {
            sum += mus[i];
            if (sum > res) {
                res = sum;
                left = index + 1;
                right = i;
            }

            if (sum < 0) {
                sum = 0;
                index = i;
            }
        }

        return new int[]{left, right, res};

    }
}
