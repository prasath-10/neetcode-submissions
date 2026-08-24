class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character ,Integer> mapp = new HashMap<>();
        for(char ch : s.toCharArray())
        {
            if(mapp.containsKey(ch)){
                mapp.put(ch , mapp.get(ch) + 1);
            }
            else{
                mapp.put(ch , 1);
            }
        }
        for(int  i = 0 ; i < s.length() ; i++)
        {
            if(mapp.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
        
    }
}