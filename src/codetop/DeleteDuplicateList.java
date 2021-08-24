package codetop;

public class DeleteDuplicateList {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null) {
                return head;
            }

            ListNode cur = head;
            while (cur.next != null) {
                //注意这里是cur和cur.next
                if (cur.value == cur.next.value) {
                    cur.next = cur.next.next;
                } else {
                    cur = cur.next;
                }
            }

            return head;
        }

    }

