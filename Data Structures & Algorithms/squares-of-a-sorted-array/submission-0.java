class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr = new int[nums.length];
        int last = nums.length - 1;
        for(int i = 0 ; i < nums.length ; i++)
        {
            nums[i] = nums[i] * nums[i];
        }
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            if(nums[left]  < nums[right]){
                arr[last] = nums[right];
                last--;
                right--; 
            }
            else{
                arr[last--] = nums[left];
                left++;
            }
        }
        //Arrays.sort(nums);
        return arr;
        
    }
}