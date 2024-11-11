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
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;  // Empty or single-element list is trivially a palindrome
        }

        // Step 1: Find the middle of the list
        ListNode middle = findMiddle(head);

        // Step 2: Reverse the second half of the list
        ListNode secondHalf = reverseList(middle);

        // Step 3: Compare the first and second halves of the list
        return compareLists(head, secondHalf);
    }

    // Function to find the middle of the linked list
    private ListNode findMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // Slow pointer will be at the middle of the list
    }

    // Function to reverse a linked list
    private ListNode reverseList(ListNode head) {
        ListNode prev = null, current = head, temp;
        while (current != null) {
            temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        return prev;  // Returns the new head of the reversed list
    }

    // Function to compare two linked lists
    private boolean compareLists(ListNode head1, ListNode head2) {
        while (head2 != null) {  // Only need to check the second half (head2)
            if (head1.val != head2.val) {
                return false;
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true;  // All values matched
    }
}