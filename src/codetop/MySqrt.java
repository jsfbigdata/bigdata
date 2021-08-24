package codetop;

public class MySqrt {
    public int mySqrt(int x) {
        int l = 0;
        int r = x;
        int result = -1;
        for (int i = 0; i < x; i++) {
            int mid = l + (r - l) / 2;
            if (mid * mid <= x) {
                l = mid + 1;
                //注意这句话
                result = mid;
            } else {
                r = mid - 1;
            }
        }
        return result;
    }
}

