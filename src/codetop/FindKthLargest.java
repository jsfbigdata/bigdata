package codetop;
import java.util.Random;
public class FindKthLargest {
    public int getKResult(int[] nums,int k,String s){
        //（1）获取最大
        //注意这里是length-k
        return quickSelect(nums,0,nums.length-1,nums.length - k);
    }
    public static  int quickSelect(int[] nums,int l,int r,int index){
        int q = randomPartition(nums,l,r);
        if(q==index){
            return nums[q];
        }
        else{
          return   q <index?quickSelect(nums,q+1,r,index):quickSelect(nums,l,q-1,index);
        }
    }
    public static int randomPartition(int[] nums,int l,int r){
        Random random = new Random();
        int randomLeft = l+ random.nextInt(r-l+1);
        swap(nums,randomLeft,r);
        return partition(nums,l,r);
    }
    public static int partition(int[] a, int l, int r) {
        int x = a[r];
        int i = l - 1;
        for (int j = l; j < r; ++j) {
            if (a[j] <= x) {
                //注意是++i
                swap(a, ++i, j);
            }
        }
        //最后一次和r做交换
        swap(a, i + 1, r);
        //注意是i+1
        return i + 1;
    }
    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
