class Solution {
    public int num(int[] nums , int k){
        int left = 0;
        int sum = 0 , count = 0;
        if( k < 0){
            return 0;
        }
        for(int right = 0 ; right < nums.length ; right++)
        {
            sum = sum + nums[right];
            while(sum > k){
              
                sum =sum - nums[left];
                left++;
            }
              count = count + (right - left + 1);

        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
    //     int sum = 0 , count = 0;
    //    for(int  i = 0 ; i < nums.length ; i++)
    //    {
    //       sum = 0;
    //     for(int  j = i ; j < nums.length;j++)
    //     {
    //         sum = sum + nums[j];
    //         if(sum == goal){
    //             count++;
    //         }
    //     }
    //    }
    //    return count;

       //optimal 
       return num(nums , goal) - num(nums , goal -1);
        
    }
}