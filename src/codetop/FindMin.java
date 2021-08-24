package codetop;

public class FindMin {
        public int findMin(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
            while (low < high) {
                int pivot = low + (high - low) / 2;
                if (nums[pivot] < nums[high]) {
                    //注意这里是
                    high = pivot;
                } else {
                    low = pivot + 1;
                }
            }
            //返回的是low的值
            return nums[low];
        }
    }

