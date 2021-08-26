package codetop;

public class SortOddEvenList {
    public ListNode sortOddEvenList(ListNode head) {
        if (head == null) {
            return null;
        }
        // 1. 分割出奇偶链表
        //奇数的起始
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = head.next;

        while (even != null && even.next != null) {
            //新增奇数
            odd.next = even.next;
            odd = odd.next;
            //删除原来链表中的技术
            even.next = even.next.next;
            even = even.next;
        }
        // 注意最后可能 odd 后还有之前的连接, 需要置空
        odd.next = null;

        // 2. 反转链表
        ListNode newEvenHead = reverse(evenHead);

        // 3. 合并两个有序链表
        return merge(head, newEvenHead);

    }

    /**
     * 反转链表
     *
     * @param head
     * @return
     */
    public ListNode reverse(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    /**
     * 合并两个有序链表
     *
     * @param h1
     * @param h2
     * @return
     */
    public ListNode merge(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        while (h1 != null && h2 != null) {
            if (h1.value <= h2.value) {
                p.next = h1;
                p = p.next;
                h1 = h1.next;
            } else {
                p.next = h2;
                p = p.next;
                h2 = h2.next;
            }
        }

        p.next = h1 == null ? h2 : h1;
        return dummy.next;

    }
    }
