package codetop;

public class AddString {
    public String addString(String num1,String num2){
        int i = num1.length()-1;
        int j = num2.length()-1;
        int add = 0;
        StringBuilder sb = new StringBuilder();
        while(i>0 || j>0 || add>0){
            int inputi = num1.charAt(i) - '0';
            int inputj = num2.charAt(j) - '0';
            int result = inputi+inputj+add;
            int tempTen = result%10;
            add = result/10;
            sb.append(tempTen);
            i--;
            j--;
        }
        sb.reverse();
        return  sb.toString();
//        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
//        StringBuffer ans = new StringBuffer();
//        while (i >= 0 || j >= 0 || add != 0) {
//            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
//            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
//            int result = x + y + add;
//            ans.append(result % 10);
//            add = result / 10;
//            i--;
//            j--;
//        }
//        // 计算完以后的答案需要翻转过来
//        ans.reverse();
//        return ans.toString();
    }
}
