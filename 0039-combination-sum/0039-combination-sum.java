class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void findCombination(int idx, int[] arr, int target, List<List<Integer>> ans, ArrayList<Integer> ds){
        if(idx == arr.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        // will take
        if(arr[idx] <= target) {
            ds.add(arr[idx]);
            findCombination(idx, arr, target - arr[idx], ans, ds);
            ds.remove(ds.size() - 1);
        }

        // will not take
        findCombination(idx + 1, arr, target, ans, ds);
    }
}