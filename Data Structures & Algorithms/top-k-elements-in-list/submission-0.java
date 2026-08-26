class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> mapp = new HashMap<>();
         int index = 0;
        for(int num : nums){
            if(mapp.containsKey(num)){
                mapp.put(num,mapp.get(num) + 1);
            }
            else{
                mapp.put(num ,1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(mapp.keySet());
        Collections.sort(ans,(a,b) -> mapp.get(b) - mapp.get(a));
        int [] num = new int[k];
        for(int i=0;i<k;i++)
        {
            num[index++] = ans.get(i);
        }
        return num;
        
    }
}