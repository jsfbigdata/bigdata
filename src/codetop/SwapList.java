package codetop;

public class SwapList {
        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            //初始化新的节点，
            ListNode newHead = head.next;
            //head next指向交换的节点，注意这里是传的newnode.next
            head.next = swapPairs(newHead.next);
            //head指向head。next
            newHead.next = head;
            return newHead;
        }


}

