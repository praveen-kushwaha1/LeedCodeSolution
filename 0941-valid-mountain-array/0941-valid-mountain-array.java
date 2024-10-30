class Solution {
    public boolean validMountainArray(int[] arr) {
        int len=arr.length,index=0;
        if(len<3)return false;
        while(index<len-1){
            if(arr[index]<arr[index+1]){
                index++;
            }
            else break;
            
        }
        if(index==0||index==len-1)return false;
        while(index<len-1){
            if(arr[index]>arr[index+1]){
                index++;
            }
            else break;
            
        }
        return (index==len-1);
    }
}