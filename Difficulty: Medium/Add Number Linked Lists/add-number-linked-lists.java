//{ Driver Code Starts
// driver

import java.io.*;
import java.util.*;


// } Driver Code Ends
/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution {
    // Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2) {
        
         // Reverse both lists so that we can start addition from the least significant digits.
    num1 = reverseList(num1);
    num2 = reverseList(num2);

    // Dummy node to help with list construction
    Node dummy = new Node(0);
    Node temp = dummy;
    int carry = 0, sum = 0, digit = 0;

    // Add corresponding digits while both lists have values or there is a carry
    while (num1 != null || num2 != null || carry != 0) {
        // Get values from the two nodes, default to 0 if the node is null
        int v1 = (num1 == null) ? 0 : num1.data;
        int v2 = (num2 == null) ? 0 : num2.data;

        // Calculate the sum and the digit for the current place
        sum = v1 + v2 + carry;
        digit = sum % 10;
        carry = sum / 10;

        // Create a new node for the current digit and link it to the result list
        Node newNode = new Node(digit);
        temp.next = newNode;
        temp = newNode;

        // Move to the next nodes in the input lists if possible
        if (num1 != null) num1 = num1.next;
        if (num2 != null) num2 = num2.next;
        
    }

    // Return the next node of dummy, as dummy is just a placeholder
    return reverseList(dummy.next);
    }
    
    static Node reverseList(Node head){
        if(head==null || head.next==null)return head;
        
        Node prev=null,curr=head,forw=null;
        while(curr!=null){
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}

//{ Driver Code Starts.

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG {

    static void printList(Node n) {
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(read.readLine());
        while (T-- > 0) {

            String str[] = read.readLine().trim().split(" ");
            int n = str.length;

            Node num1 = new Node(Integer.parseInt(str[0]));
            Node tail = num1;
            for (int i = 1; i < n; i++) {
                int val = Integer.parseInt(str[i]);
                tail.next = new Node(val);
                tail = tail.next;
            }

            String str2[] = read.readLine().trim().split(" ");
            int m = str2.length;

            Node num2 = new Node(Integer.parseInt(str2[0]));
            tail = num2;
            for (int i = 1; i < m; i++) {

                tail.next = new Node(Integer.parseInt(str2[i]));
                tail = tail.next;
            }

            Solution g = new Solution();
            Node res = g.addTwoLists(num1, num2);
            printList(res);
        
System.out.println("~");
}
    }
}

// } Driver Code Ends