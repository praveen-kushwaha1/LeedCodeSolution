// User function Template for Java

class Solution {
    int arraySum(int arr[]) {
        
        
        return findSumHelper(arr, 0);
        
    
    }
    
     private static int findSumHelper(int[] arr, int index) {
        if (index == arr.length) {
            return 0; // base case: we've reached the end
        }
        return arr[index] + findSumHelper(arr, index + 1);  // move to next index
    }
}
