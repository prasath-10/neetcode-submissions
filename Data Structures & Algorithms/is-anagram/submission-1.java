class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character , Integer> mapp = new HashMap<>();
        HashMap<Character , Integer> mapp1 = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char ch : s.toCharArray()){
            if(mapp.containsKey(ch)){
                mapp.put(ch , mapp.get(ch) + 1);
            }
            else{
                mapp.put(ch , 1);
            }
        }
        for(char ch : t.toCharArray()){
            if(mapp1.containsKey(ch)){
                mapp1.put(ch , mapp1.get(ch) + 1);
            }
            else{
                mapp1.put(ch , 1);
            }
        }
        return mapp.equals(mapp1);

    }
}
