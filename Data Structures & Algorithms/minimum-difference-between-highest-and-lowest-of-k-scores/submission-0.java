class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int left = 0;
        for(int right = 0 ; right < nums.length ; right++)
        {
             if(right - left + 1 == k)
             {
                 min = Math.min(min , (nums[right] - nums[left]));
                 left++;
             }
        }
        return min;
        
    }
}