package codetop;

public class ReverseBetween {
    public ListNode reverseBetween(ListNode head,int left,int right){
        // 设置 dummyNode 是这一类问题的一般做法
        //先找到遍历的位置
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        ListNode pre = dummyNode;
        //left这端不懂
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode next;
        //下面的和反转链表没有差别
        for (int i = 0; i < right - left; i++) {
            next = cur.next;
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
        }
        return dummyNode.next;
    }

    }
