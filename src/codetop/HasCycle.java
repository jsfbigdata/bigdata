package codetop;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            //注意这里是fast==努力了｜｜
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }

}
