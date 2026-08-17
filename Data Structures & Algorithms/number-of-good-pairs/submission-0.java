class Solution {
    public int numIdenticalPairs(int[] nums) {
        // int count = 0;
        // for(int  i = 0 ; i < nums.length ; i++)
        // {
        //     for(int  j = i + 1; j < nums.length ; j++)
        //     {
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;

        // optimal solution 

        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int a : nums){
            if(mapp.containsKey(a)){
                mapp.put(a , mapp.get(a) + 1);
            }
            else{
                mapp.put(a , 1);
            }
        }
        int count = 0;
        for(int a : mapp.values()){
            count = count + a * ( a - 1) / 2;
        }
        return count;
        
    }
}