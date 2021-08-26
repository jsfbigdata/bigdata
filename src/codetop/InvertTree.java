package codetop;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        //先递归
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        //生成
        root.left = right;
        root.right = left;
        return root;

    }
}

