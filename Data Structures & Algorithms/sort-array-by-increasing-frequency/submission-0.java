class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int  num : nums){
            if(mapp.containsKey(num)){
                mapp.put(num , mapp.get(num) + 1);
            }
            else{
                mapp.put(num , 1);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>(mapp.keySet());
        Collections.sort(ans ,(a ,b) -> {
            if(mapp.get(a) == mapp.get(b)){
                return b - a;
            }
            else{
                return mapp.get(a) - mapp.get(b);
            }
        });
        int [] arr = new int[nums.length];
        int index =0;
        for(int i = 0 ; i < ans.size() ; i++)
        {
            int a  = ans.get(i);
            int b = mapp.get(a);
            while(b != 0){
                arr[index++] = a;
                b--;
            }
        }
        return arr;
        
    }
}