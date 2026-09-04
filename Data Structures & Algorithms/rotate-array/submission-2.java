class Solution {
    public void right(int left , int right , int[]nums){
        while(left < right){
            int temp = nums[right];
            nums[right] = nums[left];
            nums[left] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
         right(0 , nums.length - 1 , nums);
        right(0 , k - 1 , nums);
        right(k, nums.length - 1 , nums);
   //left rotate = k to last , o to k - 1 , o to full;
   //right rotate = 0 to full , o to k - 1 , k , last;
       
        
    }
}