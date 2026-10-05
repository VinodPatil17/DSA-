/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        StringBuilder str = new StringBuilder(); 
        ListNode curr = head;
        while(curr != null){
            str.append(curr.val);
            curr = curr.next;
        }
        int result = 0;
        for(int i = 0; i < str.length(); i++){
            result = result * 2 + (str.charAt(i) - '0');
        }

        return result;
    }
}