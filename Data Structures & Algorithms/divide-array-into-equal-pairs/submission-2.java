class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int a : nums){
            if(mapp.containsKey(a)){
                mapp.put(a , mapp.get(a) + 1);
            }
            else{
                mapp.put(a , 1);
            }
        }
        for(int a : mapp.values()){
            if(a % 2 ==1){
                return false;
            }
        }
        return true;
        
    }
}