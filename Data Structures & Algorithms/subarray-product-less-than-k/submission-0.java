class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int left = 0 , pro = 1 , count = 0;
        if(k <= 1){
            return 0;
        }
        for(int right = 0 ; right < nums.length ; right ++)
        {
            pro = pro * nums[right];
            while(pro >= k){
                pro = pro / nums[left];
                left++;
               
            }
             count = count + (right - left + 1);
        }
        return count;
        
    }
}