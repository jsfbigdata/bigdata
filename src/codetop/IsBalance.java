package codetop;

public class IsBalance {
    public boolean isBalanced(TreeNode root) {
        //获取树的深度
        if (root == null) {
            return true;
        } else {
            //左树高度为右树的
            return Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
        }
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            return Math.max(height(root.left), height(root.right)) + 1;
        }
    }

}
