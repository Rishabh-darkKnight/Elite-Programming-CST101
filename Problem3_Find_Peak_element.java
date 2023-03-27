// // Linear Search  --> O(n)

// class Solution {
//     public int findPeakElement(int[] nums) {
//         int n = nums.length;
//         int peak = 0;
//         if(nums.length==1) {
//             return 0;
//         }
//         else if(nums[0]>nums[1]){
//             return 0;
//         }
//         else if(nums[n-1] > nums[n-2]) {
//             return n-1;
//         }
//         else {
//             for(int i=1;i<n-1;i++) {
//                 if(nums[i] > nums[i-1] && nums[i] > nums[i+1]) {
//                     peak = i;
//                     break;
//                 }
//             }
//         }

//         return peak;
//     }
// }


// Bineary Search
class Solution {
    public int findPeakElement(int[] nums) {
        int low =0;
        int high = nums.length-1;
        
        if(nums.length == 1) {
            return 0;
        }

        while(low <= high){
            int mid = low + (high - low) /2;
            
            if((mid == low || nums[mid] > nums[mid -1]) && (mid == high || nums[mid] > nums[mid+1])) {
                return mid;
            }
            else if(nums[mid] > nums[mid+1]){
                
            }
        }
    }
}