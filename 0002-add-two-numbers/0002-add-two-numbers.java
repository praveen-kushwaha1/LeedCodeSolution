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
    public ListNode addTwoNumbers(ListNode num1, ListNode num2) {
         // Find the length of both the linked lists
        int len1 = countNodes(num1);
        int len2 = countNodes(num2);

        // If num1 is smaller, swap the two linked lists by
        // calling the function with reversed parameters
        if (len1 < len2) {
            return addTwoNumbers(num2, num1);
        }

        int carry = 0;
       // num1 = reverse(num1);
        //num2 = reverse(num2);

        ListNode res = num1;

        // Iterate till either num2 is not empty or
        // carry is greater than 0
        while (num2 != null || carry != 0) {

            // Add carry to num1
            num1.val += carry;

            // If num2 linked list is not empty, add it to num1
            if (num2 != null) {
                num1.val += num2.val;
                num2 = num2.next;
            }

            // Store the carry for the next nodes
            carry = num1.val / 10;

            // Store the remainder in num1
            num1.val = num1.val % 10;

            // If we are at the last node of num1 but carry is
            // still left, then append a new node to num1
            if (num1.next == null && carry != 0) {
                num1.next = new ListNode(0);
            }

            num1 = num1.next;
        }

        // Reverse the resultant linked list to get the
        // required linked list
        return res;
    }

    // Function to find the length of linked list
    static int countNodes(ListNode head) {
        int len = 0;
        ListNode curr = head;

        while (curr != null) {
            len += 1;
            curr = curr.next;
        }
        return len;
    }
}