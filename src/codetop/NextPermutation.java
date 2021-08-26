package codetop;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        if(nums.length == 1){
            return;
        }
        if(nums.length == 2){
            swap(nums,0,1);
            return;
        }
        //从后向前找到第一个 峰
        for (int i = nums.length-2; i >= 0; i--) {
            if(nums[i+1] <= nums[i]) {
                continue;
            }
            for (int j = nums.length-1; j >i ; j--) {
                if(nums[i] >= nums[j]) {
                    continue;
                }
                swap(nums,i,j);
                revert(nums,i+1,nums.length-1);
                return;
            }
        }

        //如果都未成功
        revert(nums,0,nums.length-1);
    }

    private void revert(int[] nums,int begin,int end){
        int mid = ( end-begin) / 2+(end-begin)%2;

        int point;
        for (int i = 0; i < mid; i++) {
            point = nums[begin+i];
            nums[begin+i] = nums[end - i];
            nums[end - i] = point;
        }
    }

    private void swap(int[] nums,int i,int j ){
        int point = nums[i];
        nums[i] = nums[j];
        nums[j] = point;
    }
}
