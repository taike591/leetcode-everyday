public class _414_ThirdMaximumNumber {

    public static void insert(long[] maxArr, int val) {
        int i = 0;

        while (i < maxArr.length) {
            if (val == maxArr[i]) {
                return;

            }

            else if (val > maxArr[i]) {
                // chen val vao maxArr[i]
                break;

            } else {
                // val < maxArr
                i++;
            }
        }

        if (i < maxArr.length) {
            for (int j = maxArr.length - 2; j >= i; j--) {
                maxArr[j + 1] = maxArr[j];

            }

            maxArr[i] = val;

        }

    }

    public static int thirdMax(int[] a) {
        long[] maxArr = { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };

        for (int i = 0; i < a.length; i++) {
            insert(maxArr, a[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE) {
            return (int) maxArr[0];
        }

        return (int) maxArr[2];
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1 };
        System.out.println(thirdMax(arr));
    }

}