class Solution {
    public boolean isPalindrome(int n) {
       
       int originalnumber=n;
       int rem=0,rev=0;
       
       while(n>0){
           
           rem=n%10;
           n=n/10;
           
           rev=rev*10+rem;
           
       }
       return rev==originalnumber;
    }
}