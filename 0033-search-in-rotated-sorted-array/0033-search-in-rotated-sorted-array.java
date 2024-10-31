class Solution {
    public int search(int[] nums, int target) {

        int l=0,h=nums.length-1,m;
        while (l <= h) {
         m = l + (h - l) / 2; // Prevent potential overflow

        if (nums[m] == target) {
            return m; // Found the target
        }

        // Determine which side is sorted
        if (nums[l] <= nums[m]) { // Left side is sorted
            if (nums[l] <= target && target < nums[m]) {
                h = m - 1; // Target is in the left sorted portion
            } else {
                l = m + 1; // Target is in the right portion
            }
        } else { // Right side is sorted
            if (nums[m] < target && target <= nums[h]) {
                l = m + 1; // Target is in the right sorted portion
            } else {
                h = m - 1; // Target is in the left portion
            }
        }
    }

    return -1; // Ta
    }
}