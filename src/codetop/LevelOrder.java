package codetop;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root){
        if(root==null){
            return null;
        }
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        while(nodeQueue!=null){
            List<Integer> tempList = new LinkedList<>();
            int size = nodeQueue.size();
            for(int i=0;i<size;i++){
                TreeNode node = nodeQueue.poll();
                tempList.add(node.val);
                if(node.left!=null){
                    nodeQueue.offer(node.left);
                }
                if(node.right!=null){
                    nodeQueue.offer(node.right);
                }
            }
            result.add(new LinkedList<>(tempList));
        }
        return result;
    }
}
