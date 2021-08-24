package codetop;

public class Search {
    public int search(int[] num,int target){
        int  l = 0;
        int r = num.length;
        while(l<r){
            int middle = l+(r-l)/2;
            if(num[middle]<target){
                l = middle+1;
            }
            else if(num[middle]==target){
                return middle;
            }
            else{
                r = middle-1;
            }
        }
        return -1;
    }

}
