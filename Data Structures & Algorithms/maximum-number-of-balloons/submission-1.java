class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character , Integer> mapp = new HashMap<>();
        for(char ch : text.toCharArray()){
            mapp.put(ch , mapp.getOrDefault(ch , 0) + 1);
        }
        HashMap<Character , Integer> mapp1 = new HashMap<>();
        for(char ch : "balloon".toCharArray()){
           mapp1.put(ch , mapp1.getOrDefault(ch , 0) + 1); 
        }
      //  System.out.println(mapp);
        int res = text.length();
        for(char ch : mapp1.keySet()){
            res = Math.min(res , mapp.getOrDefault(ch , 0) / mapp1.get(ch));
        }
        return res;

        
    }
}