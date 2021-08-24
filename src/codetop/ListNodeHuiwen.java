package codetop;

import java.util.ArrayList;
import java.util.List;

public class ListNodeHuiwen {

    //放到list中，双指针便利
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();

        // 将链表的值复制到数组中
        ListNode currentNode = head;
        while (currentNode != null) {
            vals.add(currentNode.value);
            currentNode = currentNode.next;
        }

        // 头部和尾部是否相等
        int front = 0;
        int back = vals.size() - 1;
        while (front < back) {
            //这个才是核心
            if (!vals.get(front).equals(vals.get(back))) {
                return false;
            }
            front++;
            back--;
        }
        return true;
    }
}
