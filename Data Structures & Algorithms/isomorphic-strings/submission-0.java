class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> mapp = new HashMap<>();
         HashMap<Character, Character> mapp1 = new HashMap<>();
         for(int  i = 0 ; i < s.length() ; i++)
         {
            char ch = s.charAt(i)  ,  ch1 = t.charAt(i);
            if((mapp.containsKey(ch) && mapp.get(ch) != ch1) || (mapp1.containsKey(ch1) && mapp1.get(ch1) != ch)){
                return false;
            }
            mapp.put(ch , ch1);
            mapp1.put(ch1 ,ch);
         }
         return true;
        
        
    }
}