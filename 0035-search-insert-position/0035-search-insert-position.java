class Solution {
    public int searchInsert(int[] nums, int target) {

        int l=0,h=nums.length-1,m=0;
        while(h>=l){
          m=(h-l)/2+l;
          if(nums[m]==target)return m;

          else if(nums[m]>target)h=m-1;

          else l=m+1;
        }
        return l;
        
    }
}