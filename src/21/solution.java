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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode head = null, merged = null, prev = null;

        while (list1 != null || list2 != null){
            if(list1 == null || (list2 != null && list2.val < list1.val)){
                merged = new ListNode(list2.val);
                list2 = list2.next;
            }else{
                merged = new ListNode(list1.val);
                list1 = list1.next;
            }
            if(head ==null) 
                head = merged;
            else
                prev.next = merged;

            prev = merged;
            
        }
        return head;
    }
}