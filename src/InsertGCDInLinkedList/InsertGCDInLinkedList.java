package InsertGCDInLinkedList;

//https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/
public class InsertGCDInLinkedList {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode tempHead = head;
        while(head != null && head.next != null) {
            ListNode num1 = head;
            ListNode num2 = head.next;
            int gcdOfTwo = gcd(num1.val, num2.val);

            ListNode newListNode = new ListNode(gcdOfTwo, head.next);
            head.next = newListNode;
            head = newListNode.next;
        }
        return tempHead;
    }

    private int gcd(int a, int b) {
        while(b!=0){
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
