class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int  num : nums){
            if(mapp.containsKey(num)){
                mapp.put(num , mapp.get(num ) + 1);
            }
            else{
                mapp.put(num , 1);
            }
        }
        for(int num : mapp.keySet()){
            if(mapp.get(num) > (nums.length/3)){
                ans.add(num);
            }
        }
        return ans;
        
    }
}