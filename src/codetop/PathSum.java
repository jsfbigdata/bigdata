package codetop;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class PathSum {
    List<List<Integer>> ret = new LinkedList<List<Integer>>();
    Deque<Integer> path = new LinkedList<Integer>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return ret;
    }
    public void dfs(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }
        //先把结果写入队列中
        //记住要把这个先写入队列中
        //把value填入到队列中
        path.offerLast(root.val);
        targetSum -= root.val;
        //左右都为空，target变为0
        if (root.left == null && root.right == null && targetSum == 0) {
            ret.add(new LinkedList<Integer>(path));
        }
        //递归左和右
        dfs(root.left, targetSum);
        dfs(root.right, targetSum);
        path.pollLast();
    }
    }

