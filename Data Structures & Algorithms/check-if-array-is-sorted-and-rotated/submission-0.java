class Solution {
    public boolean check(int[] nums) {
        int  [] arr = new int [ 2 * nums.length];
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++)
        {
            arr[i] = nums[i];
            arr[i + nums.length] = nums[i];
        }
        for(int  i = 1 ; i < arr.length ; i++)
        {
              if(arr[i -1] <= arr[i]){
                count++;
              }
              else{
                count = 1;
              }
              if(count == nums.length){
                return true;
              }
        }
        return false;
        
    }
}