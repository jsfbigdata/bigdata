package codetop;

import java.util.*;

public class RightTreeView {
    public List<Integer> rightSideView(TreeNode root) {
        public List<Integer> rightSideView (TreeNode root){
            //空树返回空列表
            if (root == null) return new ArrayList<>();
            //将stack改成队列，进而入队列
            List<Integer> ans = new ArrayList<>();
            //层序遍历辅助队列
            Queue<TreeNode> queue = new LinkedList<>();
            //先将根节点进队
            queue.add(root);
            while (!queue.isEmpty()) {
                //当前队列容量即为树当前层节点个数
                //size变成
                int size = queue.size();
                //对应着相应层节点的出队和子节点入队
                while (size-- > 0) {
                    //弹出队列
                    //size为0则结束
                    TreeNode node = queue.poll();
                    //将每一层的最右节点加入右视图列表
                    if (size == 0)
                        ans.add(node.val);
                    //若结点存在左右孩子，进队
                    if (node.left != null) queue.add(node.left);
                    if (node.right != null) queue.add(node.right);
                }
            }
            return ans;
        }
    }
}
