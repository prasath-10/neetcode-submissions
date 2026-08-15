class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int result =1;
        int curent = 1;
        int increase = 1;
        for(int i = 1 ; i < nums.length ; i++)
        {
            if(nums[i- 1]  <  nums[i]){
                if(increase > 0){
                    curent++;
                }
                else{
                    curent = 2;
                    increase = 1;
                }
            }
            else if(nums[i - 1] > nums[i]){
                if(increase < 0){
                    curent++;
                }
                else{
                    curent = 2;
                    increase = -1;
                }
            }
            else{
                curent = 1;
                increase = 0;
            }
            result = Math.max(result , curent);
        }
        return result;
    }
}