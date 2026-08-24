class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int  num : nums){
            if(mapp.containsKey(num)){
                mapp.put(num , mapp.get(num) + 1);
            }
            else{
                mapp.put(num , 1);
            }
        }
        int duplicate = 0 , missing = 0;
        for(int i = 1; i <= nums.length ; i++)
        {
            if(mapp.containsKey(i) && mapp.get(i) == 2){
                duplicate = i;
            }
            if(!mapp.containsKey(i)){
                missing = i;
            }
        }
        return new int[] {duplicate , missing};
        
    }
}