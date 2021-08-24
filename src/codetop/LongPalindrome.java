package codetop;

public class LongPalindrome {
    public String longPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int length = s.length();
        //长度很少初始化为0，都是初始化为1
        int maxLen = 1;
        int maxStart = 0;
        int maxEnd = 0;
        //注意dp为双数组
        boolean[][] dp = new boolean[length][length];
        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                //注意这里是dp
                if (s.charAt(i) == s.charAt(j) || i - j <= 2 || dp[j + 1][i - 1]) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxStart = j;
                        maxEnd = i;
                        maxEnd = i - j + 1;
                    }
                }
            }
        }
        return s.substring(maxStart, maxEnd + 1);
    }
}
