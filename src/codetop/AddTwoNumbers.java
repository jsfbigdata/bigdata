package codetop;
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //先初始化，然后赋值
        ListNode pre = new ListNode(0);
        ListNode cur = pre;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.value;
            int y = l2 == null ? 0 : l2.value;
            int sum = x + y + carry;
            carry = sum / 10;
            sum = sum % 10;
            cur.next = new ListNode(sum);

            //注意这一句话
            cur = cur.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        //注意carry ==1这个条件
        if (carry == 1) {
            cur.next = new ListNode(carry);
        }
        return pre.next;
    }
}

