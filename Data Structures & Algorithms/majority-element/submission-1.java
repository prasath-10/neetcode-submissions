class Solution {
    public int majorityElement(int[] nums) {
        // int count = 0 , max = 0 , element = 0;
        // for(int  i = 0 ; i < nums.length ; i++)
        // {
        //     count = 1;
        //     for(int  j = i +1 ; j < nums.length ; j++)
        //     {
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        //     if(count > (nums.length/2) && count > max){
        //         max = count;
        //         element = nums[i];
        //     }
        // }
        // return element;


        //optimal solution 
        int element= 0 , max = 0;
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int  i = 0 ; i < nums.length ; i++)
        {
            if(mapp.containsKey(nums[i])){
                mapp.put(nums[i] , mapp.get(nums[i]) + 1);
            }
            else{
                mapp.put(nums[i]  , 1);
            }

        }
        for(int a : mapp.keySet()){
            if(mapp.get(a) > (nums.length/2) && mapp.get(a) > max){
                max = mapp.get(a);
                element = a;
            }
        }
        return element;
        
    }
}