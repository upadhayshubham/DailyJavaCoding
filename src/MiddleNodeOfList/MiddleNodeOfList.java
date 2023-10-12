package MiddleNodeOfList;

import java.util.ArrayList;

public class MiddleNodeOfList {
    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> arrayNodeList = new ArrayList<ListNode> ();
        int currSize = 0;
        while(head != null) {
            currSize ++;
            arrayNodeList.add(head);
            head = head.next;
        }
        return arrayNodeList.get(currSize/2);
    }

    public static void main(String[] args) {
        ListNode l = new ListNode();
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
