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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        if(head ==null||head.next==null)return null;
        
        int pos=countNodes(head)-n+1;
         if (pos == 1) {
            return head.next;
        }

         int c=0;
         while(c<pos-2){
            c++;
            temp=temp.next;
         }
         if(temp.next!=null){
         temp.next=temp.next.next;
         }
         else
         temp.next=null;
         return head; 
    }
    public static int countNodes(ListNode head){
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        return c;
    }
}