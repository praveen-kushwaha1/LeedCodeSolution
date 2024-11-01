//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long N = sc.nextLong();

            Solution ob = new Solution();
            ArrayList<Long> ans = ob.factorialNumbers(N);
            for (long num : ans) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    static ArrayList<Long> factorialNumbers(long n) {
        
        ArrayList<Long> list = new ArrayList<>();
        fac( 1, 1, list,n); 
        return list;
    }
    
    static void fac(long facto, long i, ArrayList<Long> list ,long n){
            if(facto > n  ){
                return;
            }
            
            list.add(facto);
            fac(facto*(i + 1), i+1, list, n);
    }
}