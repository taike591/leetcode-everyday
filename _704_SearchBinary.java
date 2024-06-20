public class _704_SearchBinary {

    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static int bSearch( int [] arr, int target, int iLeft, int iRight ) {
        if(iLeft > iRight) {
            return -1;
        }
        int iMid  = (iLeft + iRight) / 2;
        if(target == arr[iMid]) {
            return iMid;
        } else if(target < arr[iMid]) {
            return bSearch(arr, target, iLeft, iMid - 1);
        } else {
            return bSearch(arr, target, iMid + 1, iRight);
        }

    }

    public static int bSearch (int [] arr, int target) {

        int n = arr.length;
        return bSearch(arr, target, 0, n-1);

    }



    public static void main(String[] args) {
        int[] arr = { -1, 0, 3, 5, 9, 12 };
        int target = 9;
        System.out.println(search(arr, target));
    }
}
