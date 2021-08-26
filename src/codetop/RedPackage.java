package codetop;

public class RedPackage {
//    private static final double MINMONEY = 0.01;
//    public static void hongbaotest(double totalmoney, int count) {
//        double[] moneys = new double[count];
//        //记住要从1开始
//        for(int i=1; i<count; i++) {
//            // 当前第i个红包的最大金额与实际金额，实际金额保证不小于最小金额
//            //还能剩的最多的钱
//            double maxmoney = (totalmoney - (count-i) * MINMONEY) / (count - i);
//            //先排掉都有的
//            double curmoney = Math.random() * (maxmoney - MINMONEY) + MINMONEY;
//            totalmoney -= curmoney;
//            moneys[i-1] = curmoney;
//        }
//        // 最后一个红包
//        moneys[count-1] = totalmoney;
//    }

    private  final double MIN_ACCOUNT =  0.01;
    public  double[] redPackage(double total,int n){
        double[] result  = new double[n];
        for(int i=1;i<n;i++) {
            //每个人能分到的最多钱
            double maxMoney = (total - (n-i)*MIN_ACCOUNT) / (n-i);
            double currentMoney = Math.random()*(maxMoney-MIN_ACCOUNT) +MIN_ACCOUNT;
            total -= currentMoney;
            result[i-1] = currentMoney;
        }
        result[n-1] = total;
        return  result;

    }



}
