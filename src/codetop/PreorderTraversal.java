package codetop;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PreorderTraversal {
    List<Integer> result = new LinkedList<>();
    public List<Integer>  preorderTraversal(TreeNode node){
        dfs(node,result);
        return  result;
    }
    void dfs(TreeNode node,List<Integer> result){
        result.add(node.val);
        dfs(node.left,result);
        dfs(node.right,result);
    }

}
