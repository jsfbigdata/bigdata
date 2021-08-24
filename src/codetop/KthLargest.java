package codetop;

public class KthLargest {
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    private void dfs(TreeNode root){
        //倒置的中序遍历
        // 如果 root 为空，或者已经获取了第k大的节点，则结束递归
        if(root == null || k == 0) return;
        // 倒置中序遍历：右 -> 中 -> 左
        dfs(root.right);
        if(--k == 0) res = root.val;
        dfs(root.left);
    }
}
