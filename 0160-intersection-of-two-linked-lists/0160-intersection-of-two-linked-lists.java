/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Integer> list = new HashMap<>();

        ListNode tempA=headA,tempB=headB;

        while(tempA!=null){
           list.put(tempA,1);
           tempA=tempA.next;
        }
        while(tempB!=null){
            if(list.containsKey(tempB))return tempB;
            tempB=tempB.next;
        }
        return null;
        
    }
}