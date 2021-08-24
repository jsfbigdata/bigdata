package codetop;
public class CommonAncient {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) return root;
        //注意这里是p和q不是node.left和node.right
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        //左为空则返回右
        if (left == null) return right;
        if (right == null) return left;
        return root;

    }


}
