// User function Template for Java
class Solution {
    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        
        
        char[]chs=s.toCharArray();
        
        for(int i=0;i<chs.length;i++){
            
            if(ch==chs[i])return i;
        }
        return -1;
    }
}