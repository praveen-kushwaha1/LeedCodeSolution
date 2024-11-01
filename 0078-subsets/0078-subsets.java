class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
       List<List<Integer>> ans=new ArrayList<>();
       // backtrack(nums,ans,0,new ArrayList<>());
        subset(0, nums, new ArrayList<>(), ans);
         return ans;
    }

     public static void subset(int idx, int[] nums, ArrayList<Integer> ds, List<List<Integer>> ans){
        if(idx >= nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        // will take
        ds.add(nums[idx]);
        subset(idx + 1, nums, ds, ans);
        ds.remove(ds.size() - 1);

        // will not take
        subset(idx + 1, nums, ds, ans);
    }


    public static  void  backtrack(int[] nums,List<List<Integer>> ans,int index,List<Integer>emptylist){
        if(index>=nums.length){
             ans.add(new ArrayList<>(emptylist));
            return  ;
        }
        emptylist.add(nums[index]);
        backtrack(nums,ans,index+1,emptylist);
        emptylist.remove(emptylist.size()-1);
        backtrack(nums,ans,index+1,emptylist);
    }
}