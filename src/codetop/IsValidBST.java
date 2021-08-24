package codetop;

public class IsValidBST {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean isValidBST(TreeNode node, long lower, long upper) {
        if (node == null) {
            return true;
        }
        //如果小于最小值,或者大于最大值
        //这个是核心，操作node value和node left和node right 节点
        if (node.val <= lower || node.val >= upper) {
            return false;
        }
        //left：lower-》val
        //right：val-》upper
        return isValidBST(node.left, lower, node.val) && isValidBST(node.right, node.val, upper);
    }
}
