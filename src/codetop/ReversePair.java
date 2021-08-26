package codetop;

public class ReversePair {
    public int reversePairs(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return 0;
        }
        //暂存排序的临时数组
        int[] temp = new int[len + 1];
        //归并排序加计算逆序数
        sort(nums, 0, len - 1, temp);
        //临时数组最后一位存放逆序对
        return temp[len];
    }

    private void sort(int[] nums, int low, int high, int[] temp) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) >> 1;
        //将左边的子数组排序
        sort(nums, low, mid, temp);
        //将右边的子数组排序
        sort(nums, mid + 1, high, temp);
        //合并两个排序数组加计算逆序数
        merge_count(nums, low, mid, high, temp);
    }

    private void merge_count(int[] nums, int low, int mid, int high, int[] temp) {
        int i = low, j = mid + 1, p = low;
        int len = nums.length;
        while (i <= mid && j <= high) {
            //如果左边的子数组当前的指针指向的值比右边的小或相等，证明不是逆序对，插入到temp数组中
            if (nums[i] <= nums[j]) {
                temp[p++] = nums[i++];
            } else {
                temp[p++] = nums[j++];
                //有逆序对，且因为数组有序，所以i下标到mid下标的数字都和j指向的构成逆序对，逆序对为mid- i + 1
                temp[len] += (mid - i) + 1;
            }
        }
        while (i <= mid) {
            temp[p++] = nums[i++];
        }
        while (j <= high) {
            temp[p++] = nums[j++];
        }
        System.arraycopy(temp, low, nums, low, high - low + 1);
    }
}
