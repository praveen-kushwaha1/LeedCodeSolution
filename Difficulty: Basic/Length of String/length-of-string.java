// User function Template for Java

class Solution {
    // Complete the function
    // str: input string
    public static int lengthString(String str) {
        
        char []ch=str.toCharArray();
        int c=0;
        for(int i=0;i<ch.length;i++){
            c++;
        }
        
        
        char[] chars = str.toCharArray();
        
        return c;
    }
}