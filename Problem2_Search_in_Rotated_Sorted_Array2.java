class Solution {
    public boolean search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;

        if(nums.length == 1 && nums[0] == target) {
            return true;
        }
        
        while(low <= high) {
            
            int mid = low + (high-low)/2; // to save from overflow
            
            if(nums[mid]==target) {
                return true;
            }

            if(nums[mid] > nums[low]){  // this is for case if left side sorted 
                if(target > nums[low] && target <= nums[mid]) {
                     high = mid -1;
                }
                else {
                    low = mid + 1;
                }
            }
            else if(nums[mid] < nums[low]) {  // now for the case if right side is sorted
                if(target > nums[mid] && nums[high] > target) {
                    low = mid+1;
                }
                else {
                    high = mid -1;
                }
            }
            else {
                low++;
            }
            
        }
        return false;
    }
}