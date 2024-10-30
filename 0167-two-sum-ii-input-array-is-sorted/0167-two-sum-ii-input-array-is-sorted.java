class Solution {
    public int[] twoSum(int[] nums, int target) {
         int n=nums.length;
         int l=0,h=n-1;
       while(h>l){
        if(nums[l]+nums[h]==target)return new int []{l+1,h+1};
        else if(nums[l]+nums[h]>target)h=h-1;
        else l=l+1;
       }
       return new int []{};
    }
}