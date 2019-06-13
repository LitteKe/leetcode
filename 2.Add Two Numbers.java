/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode re = new ListNode(0);
        ListNode p = re;
        int sum = 0;
        int carry = 0;
        while(l1 != null && l2 != null){
            sum = (l1.val + l2.val + carry)%10;
            re.next = new ListNode(sum);
            carry = (l1.val + l2.val + carry)/10;
            re = re.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1 != null){
            sum = (l1.val + carry)%10;
            re.next = new ListNode(sum);
            carry = (l1.val + carry)/10;
            re = re.next;
            l1 = l1.next;
        }
        while(l2 != null){
            sum = (l2.val + carry)%10;
            re.next = new ListNode(sum);
            carry = (l2.val + carry)/10;
            re = re.next;
            l2 = l2.next;
        }
        if(carry != 0){
            re.next = new ListNode(1);
        }
        return p.next;
    }
}
