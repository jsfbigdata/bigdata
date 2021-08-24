package codetop;

public class MergeTwoLists {
    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        //注意是头插法，生成了一个新的
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while(l1!=null && l2!=null){
            if(l1.value>l2.value){
                cur.next =l1;
                l1 = l1.next;
            }
            else{
                cur.next  = l2;
                l2 = l2.next;
            }
            //往下迭代,这个是核心
            cur = cur.next;
        }
        cur.next = l1==null?l2:l1;
        return  cur;
    }
}
