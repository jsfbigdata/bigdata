package codetop;

public class GetKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        //先跑k个，然后再同时跑
        ListNode former = head, latter = head;
        for(int i = 0; i < k; i++)
            former = former.next;
        //注意这里是former
        while(former != null) {
            former = former.next;
            latter = latter.next;
        }
        //注意这里是返回的latter
        return latter;
    }


}
