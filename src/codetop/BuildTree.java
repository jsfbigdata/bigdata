package codetop;

import java.util.Deque;
import java.util.LinkedList;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[0]);
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        //第一步推入栈
        stack.push(root);
        int inorderIndex = 0;
        //第二步遍历前序
        for (int i = 1; i < preorder.length; i++) {
            int preorderVal = preorder[i];
            //第三步 弹出当前节点去比较
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                //第四步不相同则构建左节点并推入
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    //弹出节点
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
}
