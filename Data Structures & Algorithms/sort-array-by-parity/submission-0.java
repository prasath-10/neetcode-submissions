class Solution {
    public int[] sortArrayByParity(int[] nums) {
        // int odd = 1;
        // int even = 0;
        // int index = 0;
        // int [] arr = new int[nums.length];
        // for(int  i = 0 ; i < nums.length ; i++)
        // {
        //       if(nums[i] % 2 == 0){
        //         arr[index++] = nums[i];
        //       }
        // }
        //  for(int  i = 0 ; i < nums.length ; i++)
        // {
        //       if(nums[i] % 2 == 1){
        //         arr[index++] = nums[i];
        //       }
        // }
        // return arr;
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left] % 2 == 1 && nums[right] % 2 == 0){
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
            }
            else if(nums[left] % 2  == 1 && nums[right] % 2 == 1){
                  right--;
            }
            else{
                left++;
            }
        }
        return nums;
        
    }
}