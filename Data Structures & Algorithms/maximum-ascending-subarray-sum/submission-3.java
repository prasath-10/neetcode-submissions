class Solution {
    public int maxAscendingSum(int[] nums) {
         int sum = nums[0] , res = nums[0];
         for(int  i = 1 ; i < nums.length ; i++)
         {
             if(nums[i -1] >= nums[i]){
                 sum = 0;
             }
             sum =sum + nums[i];
             res = Math.max(res , sum);
         }
         return res;

        // int sum = 0 , max = 0;
        // for(int  i = 0 ; i < nums.length ; i++)
        // {
        //      sum = nums[i];
        //     for(int  j = i + 1 ; j < nums.length ; j++)
        //     { 
        //           if(nums[j - 1] < nums[j])
        //           {
        //             sum = sum + nums[j];
        //           }
        //           else{
        //             max = Math.max(max , sum);
        //             break;
        //           }
        //     }
        //     max = Math.max(max , sum);
        // }
        // return max;
        
    }
}