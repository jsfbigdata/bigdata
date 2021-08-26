package codetop;
public class DeleteDuplicate {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        //初始化一个dummy node
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            //判断出值相等
            if (cur.next.value == cur.next.next.value) {
                int x = cur.next.value;
                //
                while (cur.next != null && cur.next.value == x) {
                    //一直往下遍历，和删除
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }
        }

        return dummy.next;
    }

}
