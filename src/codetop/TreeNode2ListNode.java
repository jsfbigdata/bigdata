package codetop;

public class TreeNode2ListNode {
    public ListNode treeNod2ListNode() {
        ListNode pre, head;
        public Node treeToDoublyList (TreeNodeNode root){
            if (root == null) return null;
            dfs(root);
            head.left = pre;
            pre.right = head;
            return head;
        }
        void dfs (Node cur){
            if (cur == null) return;
            dfs(cur.left);
            if (pre != null) pre.right = cur;
            else head = cur;
            cur.left = pre;
            pre = cur;
            dfs(cur.right);
        }
    }

}
