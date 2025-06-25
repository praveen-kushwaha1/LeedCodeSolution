class Solution {

    static void generateSubset(int[]nums,List<Integer> current,int index,List<List<Integer>>result){
    
      if(index==nums.length){
      result.add(new ArrayList<>(current));
      return;
      }
      current.add(nums[index]);
      generateSubset(nums, current, index + 1, result);
      current.remove(current.size() - 1);
      generateSubset(nums, current, index + 1, result);

    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        generateSubset(nums,new ArrayList<>(),0,result);
        return result;
    }

}