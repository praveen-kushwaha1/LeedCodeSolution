// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        
         StringBuilder sb = new StringBuilder(s);
        int left = 0, right = sb.length() - 1;

        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }

        return sb.toString();
    }
}