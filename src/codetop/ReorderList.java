package codetop;

import java.util.ArrayList;
import java.util.List;

public class ReorderList {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        //list中把node遍历一下然后装进去
        List<ListNode> list = new ArrayList<ListNode>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int i = 0, j = list.size() - 1;
        while (i < j) {
            //交叉
            //i.next->j
            list.get(i).next = list.get(j);
            i++;
            if (i == j) {
                break;
            }
            //j.next->i
            list.get(j).next = list.get(i);
            j--;
        }
        list.get(i).next = null;
    }
}

