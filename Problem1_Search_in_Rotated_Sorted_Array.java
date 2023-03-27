class Solution {
    public int search(int[] nums, int target) {
        
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high) {
            
            int mid = low + (high-low)/2; // to save from overflow
            
            if(nums[mid]==target) {
                return mid;
            }

            if(nums[mid] >= nums[low]){  // this is for case if left side sorted 
                if(target >= nums[low] && target <= nums[mid]) {
                     high = mid -1;
                }
                else {
                    low = mid + 1;
                }
            }
            else {  // now for the case if right side is sorted
                if(target >= nums[mid] && nums[high] >= target) {
                    low = mid+1;
                }
                else {
                    high = mid -1;
                }
            }
            
        }
        return -1;
    }
}