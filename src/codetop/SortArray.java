package codetop;

import java.util.Random;

import static codetop.FindKthLargest.swap;

public class SortArray {
    public static int[] sortArray(int[] rawSort){
        int left =0;
        int right = rawSort.length;
        getSortpartition(rawSort,left,right);
        return  rawSort;
    }
    public static void getSortpartition(int[] input,int left,int right){
        //注意这里left和right都传
        //迭代直到两个碰撞到一块儿
       if(left<right){
          int pos =  randomPartition(input,left,right);
          getSortpartition(input,pos+1,right);
          getSortpartition(input,left,pos-1);
       }

    }

    public static int  randomPartition(int[] input,int l,int r){
        Random random = new Random();
        int left  = l+random.nextInt(r-l+1);
        swap(input,left,r);
        return partition(input,left,r);

    }
    public static int  partition(int[] input,int l, int r){
        int a = input[r];
        int i = l-1;
        //注意这里是j=l
        for(int j= l;j<r;j++){
            if(input[j]<a){
                swap(input,i++,j);
            }
        }
        swap(input,i++,r);
        return  i+1;
    }

}
