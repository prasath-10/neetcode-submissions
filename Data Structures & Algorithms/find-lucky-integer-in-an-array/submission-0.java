class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int num : arr){
            if(mapp.containsKey(num)){
                mapp.put(num , mapp.get(num) + 1);
            }
            else{
                mapp.put(num , 1);
            }
        }
        int max = -1;
        for(int a : mapp.keySet()){
            if(mapp.get(a) == a){
                max = Math.max(max , a);
            }
        }
        return max;
        
    }
}