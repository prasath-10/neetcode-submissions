class Solution {
    public int maxDifference(String s) {
        HashMap<Character ,Integer> mapp = new HashMap<>();
        int odd = 0 , even = Integer.MAX_VALUE , max = 0;
        for(char ch : s.toCharArray()){
            if(mapp.containsKey(ch)){
                mapp.put(ch , mapp.get(ch) + 1);
            }
            else{
                mapp.put(ch , 1);
            }
         
        }
        for(char ch : mapp.keySet()){
            if(mapp.get(ch) % 2 ==1){
                odd =Math.max(odd , mapp.get(ch));
            }
            else{
                even = Math.min(even , mapp.get(ch));
            }
        }
        System.out.println(odd);
        System.out.println(even);
        return odd - even;
    }
}