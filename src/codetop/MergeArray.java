package codetop;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MergeArray {

    //初始化
    //cur复制
    /
    public void mergeArray(int[] nums1,int m,int[] nums2,int n){
        //注意这里要加p1和p2
        int p1 = 0, p2 = 0;
        //注意这里是初始化了
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            //注意这里是p1+p2-1
            sorted[p1 + p2 - 1] = cur;
        }
        //注意这里的不等号，非常重要
        for (int i = 0; i != m + n; ++i) {
            nums1[i] = sorted[i];
        }
    }
    }

//    int cur;
//        while (p1 < m || p2 < n) {
//        if (p1 == m) {
//            cur = nums2[p2++];
//        } else if (p2 == n) {
//            cur = nums1[p1++];
//        } else if (nums1[p1] < nums2[p2]) {
//            cur = nums1[p1++];
//        } else {
//            cur = nums2[p2++];
//        }
//        sorted[p1 + p2 - 1] = cur;
//    }
//        for (int i = 0; i != m + n; ++i) {
//        nums1[i] = sorted[i];
//    }