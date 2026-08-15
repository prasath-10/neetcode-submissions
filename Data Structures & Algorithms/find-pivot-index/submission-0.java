class Solution {
    public int pivotIndex(int[] nums) {
        int total = 0 , leftsum = 0;
        for(int  i = 0 ; i < nums.length ; i++)
        {
            total = total + nums[i];
        }
        for(int  i = 0 ; i < nums. length ; i++)
        {
              total = total - nums[i];
              if(leftsum == total){
                  return i;
              }
              leftsum = leftsum + nums[i];
        }
        return -1;
        
    }
}