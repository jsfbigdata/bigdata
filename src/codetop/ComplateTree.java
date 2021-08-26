package codetop;

import java.util.LinkedList;
import java.util.Queue;

public class ComplateTree {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        //（1）
        boolean reachedEnd = false;
        while(!q.isEmpty()){
            TreeNode cur = q.poll();
            //已经到底， 且curr不为空
            //（2）
            if(reachedEnd && cur != null){
                return false;
            }
            //（3）cur为空时，continue
            if(cur == null){
                reachedEnd = true;
                //注意这里要continue
                continue;
            }
            q.offer(cur.left);
            q.offer(cur.right);
        }
        return true;


    }
}
