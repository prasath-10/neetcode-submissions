class Solution {
    public int sub(int[] nums , int g){
        if( g < 0){
            return 0;
        }
        HashMap<Integer , Integer> mapp = new HashMap<>();
        int left = 0;
        int count = 0;
        for(int right = 0 ;right < nums.length ; right++)
        {
            if(mapp.containsKey(nums[right])){
                mapp.put(nums[right] , mapp.get(nums[right]) + 1);
            }
            else{
                mapp.put(nums[right] , 1);
            }
            while(mapp.size() > g){
                mapp.put(nums[left] , mapp.get(nums[left]) -1);
            
                if(mapp.get(nums[left]) == 0){
                    mapp.remove(nums[left]);
                }
                left++;
            }
            count = count + (right - left + 1);

        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return sub(nums , k) - sub(nums , k-1);
        
    }
}