package codetop;

public class SumNumbers {
    public int sumNumbers(TreeNode root){
            return dfs(root, 0);
        }

        public int dfs(TreeNode root, int prevSum) {
            if (root == null) {
                return 0;
            }
            //上个sum的结果*10+当前的value
            int sum = prevSum * 10 + root.val;
            if (root.left == null && root.right == null) {
                return sum;
            } else {
                return dfs(root.left, sum) + dfs(root.right, sum);
            }
        }
        }





