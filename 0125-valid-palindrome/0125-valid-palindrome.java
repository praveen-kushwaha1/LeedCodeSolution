class Solution {
    public boolean isPalindrome(String s) {
      
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int l=0,h=s.length()-1;
       // return palindromef(s,l,h);
        while(h>l){
       if(s.charAt(l)!=s.charAt(h)){
           return false;
        }
        l++;
        h--;
        }

        return true;
    }

     public static boolean palindrome(String str, int start, int end){
        if(start >= end){
            return true;
        }
        else{
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            return palindrome(str, start + 1, end - 1);
        }
    }
}