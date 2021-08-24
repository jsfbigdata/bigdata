package codetop;

public class MergeList {
    public ListNode mergeList(ListNode l1,ListNode l2){
        ListNode preNode  = new ListNode(-1);
        ListNode cur = preNode;
        while(l1!=null && l2!=null){
            if(l1.value>l2.value){
                cur.next = l1;
                l1 = l1.next;
            }
            if(l1.value<=l2.value){
                cur.next  = l2;
                l2 = l2.next;

            }
            cur = cur.next;
        }
        cur = l1==null?l2:l1;
        return  cur.next;
    }
}
