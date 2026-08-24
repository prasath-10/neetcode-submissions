class Solution {
    public int longestPalindrome(String s) {
         HashMap<Character ,Integer> mapp = new HashMap<>();
       int res = 0;
       for(char ch : s.toCharArray())
       {
            if(mapp.containsKey(ch)){
                mapp.put(ch , mapp.get(ch) + 1);
            }
            else{
                mapp.put(ch , 1);
            }
            if(mapp.get(ch) % 2 == 0){
                res = res + 2;
            }
       }
       for(int a : mapp.values()){
          if(a % 2 == 1){
              res++;
              break;
          }
       }
       return res;
        
    }
}