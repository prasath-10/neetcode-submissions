class Solution {
    public int[] replaceElements(int[] arr) {
        int [] nums = new int[arr.length];
        // for(int  i = 0 ; i < arr.length ; i++)
        // {
        //    int  rightmax = -1;
        //     for(int j = i + 1 ; j < arr.length ; j++)
        //     {
        //         rightmax = Math.max(rightmax , arr[j]);
        //     }
        //     nums[i] = rightmax;
        // }
        // return nums;



        // optimal solution = suffix max
        int rightmax = -1;
        for(int  i = arr.length - 1 ; i >= 0 ; i--){
             nums[i] = rightmax;
             rightmax = Math.max(rightmax , arr[i]);
        }
        return nums;
        
    }
}