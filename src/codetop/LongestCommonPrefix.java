package codetop;

public class LongestCommonPrefix {
//    public String longestCommonPrefix(String[] strs) {
//        if (strs == null || strs.length == 0) return "";
//        String res = strs[0];
//        int i = 1;
//        while (i < strs.length) {
//            while (strs[i].indexOf(res) != 0) {
//                //result= result.
//                res = res.substring(0, res.length() - 1);
//            }
//            i += 1;
//        }
//        return res;
//
//    }
    public String getCommonPrefix(String[] strs){
        String res = strs[0];
        int i = 1;
        while(i<strs.length){
            while(strs[i].indexOf(res)!=0){
                res = res.substring(0,res.length()-1);
            }
            i++;
        }
        return res;
    }
}
