class Solution {
    public int majorityElement(int[] nums) {
        int count = 0 , max = 0 , element = 0;
        for(int  i = 0 ; i < nums.length ; i++)
        {
            count = 1;
            for(int  j = i +1 ; j < nums.length ; j++)
            {
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count > (nums.length/2) && count > max){
                max = count;
                element = nums[i];
            }
        }
        return element;
        
    }
}