class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length-1;
        while (left <= right) {
            int mid = left + (right-left)/2;
            if (nums[mid] == target) return mid;
            
            if (nums[mid] >= nums[left]) { // left subarray is sorted
                if (nums[left] <= target && target < nums[mid]) { // target lies in range [left,mid]
                    right = mid-1;
                } else {
                    // go and check right subarray
                    left = mid+1;
                }
            } else { // right subarray is sorted
                if (target > nums[mid] && target <= nums[right]) { // target lise in range [mid,right]
                    left = mid+1;
                } else {
                    // go and check left subarray
                    right = mid-1;
                }
            }
        }
        
        return -1;
    }
}
