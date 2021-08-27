package codetop;

public class ReversePair {
    int[] nums, tmp;
    public int reversePairs(int[] nums) {
        this.nums = nums;
        tmp = new int[nums.length];
        return mergeSort(0, nums.length - 1);
    }
    private int mergeSort(int l, int r) {
        // 终止条件
        if (l >= r) return 0;
        // 递归划分
        int m = (l + r) / 2;
        //
        int res = mergeSort(l, m) + mergeSort(m + 1, r);
        // 合并阶段
        int i = l, j = m + 1;
        //把结果放入到临时array中
        for (int k = l; k <= r; k++)
            tmp[k] = nums[k];

        for (int k = l; k <= r; k++) {
            if (i == m + 1) {
                nums[k] = tmp[j++];
            }
            //tmp[i]<temp[j]也就是取小的
            else if (j == r + 1 || tmp[i] <= tmp[j]) {
                nums[k] = tmp[i++];
            }

            else {
                nums[k] = tmp[j++];
                //else情况下才
                res += m - i + 1; // 统计逆序对
            }
        }
        return res;
    }


}
