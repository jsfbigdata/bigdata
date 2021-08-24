package codetop;

import java.util.HashMap;

public class LruCacheTest {
    public class DlinkedNode {
        DlinkedNode pre;
        DlinkedNode next;
        int k;
        int v;

        void DlinkedNode(int key, int value) {
            this.k = key;
            this.v = value;
        }

        void DlinkedNode() {

        }
    }
    DlinkedNode pre;
    DlinkedNode next;
    HashMap<Integer,DlinkedNode> cache = new HashMap<>();

    void LruCacheTest(int capacity){
           pre.next = next;
           next.pre = pre;


       }

}
