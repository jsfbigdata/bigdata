package codetop;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZagTreeLevel {
    public List<List<Integer>> getZigZagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        boolean isLeftOrder = true;
        while (nodeQueue != null) {
            int size = nodeQueue.size();
            //双端队列
            Deque<Integer> list = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                //
                TreeNode node = nodeQueue.poll();
                if (isLeftOrder) {
                    list.offerLast(node.val);
                }
                if (!isLeftOrder) {
                    list.offerFirst(node.val);
                }
                //哪个不为空塞哪个
                if (node.left != null) {
                    nodeQueue.offer(node.left);
                }
                if (node.right != null) {
                    nodeQueue.offer(node.right);
                }
            }
            result.add(new LinkedList<>((list)));
            isLeftOrder = !isLeftOrder;
        }
        return result;
    }
}



