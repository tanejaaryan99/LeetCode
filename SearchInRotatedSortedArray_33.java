// public class SearchInRotatedSortedArray_33 {

// }
//using Binary search
class Solution {
    public int search(int[] nums, int target) {
        return sol(nums, target);
    }

    public int sol(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[lo] <= arr[mid]) {
                if (target >= arr[lo] && target <= arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else if (arr[mid] <= arr[hi]) {
                if (target >= arr[mid] && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

}