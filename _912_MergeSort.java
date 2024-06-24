public class _912_MergeSort {

    public int [] merge(int [] a1, int [] a2) {
        int n =a1.length + a2.length;
        int [] result = new int[n];

        int i = 0, i1 = 0,i2= 0;
        while(i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] < a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else if (i1 < a1.length) {
                result[i] = a1[i1];
                i++;
                i1++;
            } else {
                result[i] = a2[i2];
                i++;
                i2++;
            }
        }
        return result;
    }


    public int[] mergeSort(int a[], int L, int R) {
        // THDB DKD

        if (L > R) {
            return new int[0];
        }

        if (L == R) {
            int [] singleElement = {a[L]};
            return singleElement;

        }

        // thqt

        //chia ra
        int k = (L + R) / 2;

        int [] a1 = mergeSort(a, L, k);

        int [] a2 = mergeSort(a, k + 1, R);

        // tron vào



        int [] result = merge(a1, a2);
        return result;

    }

    public int[]  sortArray(int[] nums){
        return mergeSort(nums, 0, nums.length-1 );
    }

    public static void main(String[] args) {
        _912_MergeSort obj = new _912_MergeSort();
        int [] a = {5, 2, 3, 1};
        int [] result = obj.sortArray(a);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }



}
