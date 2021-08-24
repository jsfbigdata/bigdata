package codetop;

public class SearchMinTurnsArray {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        while (low < high) {
            int pivot = low + (high - low) / 2;
            if (nums[pivot] < nums[high]) {
                //注意这里不是-1而是high
                high = pivot;
            } else {
                low = pivot + 1;
            }
        }
        return nums[low];
    }
}
