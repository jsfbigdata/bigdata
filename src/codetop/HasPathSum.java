package codetop;

import java.util.LinkedList;
import java.util.Queue;

public class HasPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queNode = new LinkedList<TreeNode>();
        Queue<Integer> queVal = new LinkedList<Integer>();
        queNode.offer(root);
        queVal.offer(root.val);
        while (!queNode.isEmpty()) {
            TreeNode now = queNode.poll();
            //在这里把结果pop出来
            int temp = queVal.poll();
            //弹出来都为空、
            //一直判断是否为空即可，注意这是一次的遍历
            if (now.left == null && now.right == null) {
                //等于sum，则认为相同
                if (temp == sum) {
                    return true;
                }
                //注意这个continue
                continue;
            }
            //左不为空
            if (now.left != null) {
                queNode.offer(now.left);
                queVal.offer(now.left.val + temp);
            }
            //右不为空
            if (now.right != null) {
                queNode.offer(now.right);
                queVal.offer(now.right.val + temp);
            }
        }
        return false;
    }
}
