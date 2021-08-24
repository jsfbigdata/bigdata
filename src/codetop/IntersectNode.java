package codetop;

public class IntersectNode {
    public static ListNode getIntersecNode(ListNode headA,ListNode headB) {
        ListNode firstNode = headA;
        ListNode sencondNode = headB;
        if(headA==null || headB ==null) {
            return null;
        }
        //双节点不为空
        while(firstNode!=sencondNode){
          firstNode = firstNode==null?headB:firstNode.next;
          sencondNode   = sencondNode==null?headA:sencondNode.next;
        }
        //返回起始节点
        return  firstNode;
    }
}
