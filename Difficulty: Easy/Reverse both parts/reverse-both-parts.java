//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }

    public static Node inputList(BufferedReader br) throws IOException {

        String[] s = br.readLine().trim().split(" ");
        Node head = new Node(Integer.parseInt(s[0])), tail = head;
        for (int i = 1; i < s.length; i++)
            tail = tail.next = new Node(Integer.parseInt(s[i]));

        return head;
    }

    public static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            Node head = Node.inputList(br);

            int k;
            k = Integer.parseInt(br.readLine());

            Solution obj = new Solution();
            Node res = obj.reverse(head, k);

            Node.printList(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static  Node reverseHalf(Node head) {
         if(head == null) 
         return  head; 
         
         Node curr= head; 
         Node prev= null; 
         Node next = null; 
         
         while( curr!= null ){
             next = curr.next; 
             curr.next = prev ; 
             prev= curr ; 
             curr=  next ; 
         }
         
         return prev; 
    }
    public static Node reverse(Node head, int k) {
        // code here
        if( head ==  null || head.next == null ) return head; 
        
        Node temp1= head; 
        Node temp2= null ; 
        
        while( temp1.next != null ){
            if(k > 0) {
                temp2=temp1; 
            }
            temp1= temp1.next; 
            k--;
        }
        Node temp =  temp2.next ; 
        temp2.next= null ; 
        Node firstHalf =   reverseHalf(head);
        Node secondHalf =   reverseHalf(temp ) ; 
        
        head = firstHalf; 
        temp =firstHalf;
        while( temp.next!= null ){
            temp = temp.next; 
        }
        temp.next= secondHalf; 
        
        return head; 
    }
}
