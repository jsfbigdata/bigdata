package codetop;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class InorderTraversal {
    List<Integer> result  = new ArrayList<>();
    public List<Integer> inorderTravel(TreeNode root) {
        if (root == null) {
            return null;
        }
        dfs(root,result);
        return result;
    }
    void dfs(TreeNode node,List<Integer> result){
        if(node==null){
            return;
        }
        dfs(node.left,result);
        result.add(node.val);
        dfs(node.right,result);
    }

    public List<Integer> getTreeNode(TreeNode root) {
        Deque<TreeNode> nodeQueue = new LinkedList<>();
        while(!nodeQueue.isEmpty() || root!=null) {
            while(root!=null) {
                nodeQueue.push(root);
                root = root.left;
            }
            TreeNode node = nodeQueue.pop();
            result.add(node.val);
            root = root.right;
        }
        return result;
    }
}




//        List<Integer> res = new ArrayList<>();
//        public List<Integer> inorderTraversal(TreeNode root) {
//            List<Integer> res = new ArrayList<Integer>();
//            inorder(root, res);
//            return res;
//        }
//
//        public void inorder(TreeNode root, List<Integer> res) {
//            if (root == null) {
//                return;
//            }
//            inorder(root.left, res);
//            res.add(root.val);
//            inorder(root.right, res);
//        }
//    }

