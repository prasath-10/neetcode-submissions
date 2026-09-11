class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character ,Integer> mapp = new HashMap<>();
        int left = 0 ,max = 0 , max1 = 0;
        for(int right = 0 ; right < s.length() ; right++)
        {
            if(mapp.containsKey(s.charAt(right))){
                mapp.put(s.charAt(right) , mapp.get(s.charAt(right)) + 1);
            }
            else{
                mapp.put(s.charAt(right) , 1);
            }
            for(int a : mapp.values()){
                max = Math.max(max , a);
            }
            while((right - left + 1) - max > k){
                mapp.put(s.charAt(left) , mapp.get(s.charAt(left)) - 1);
                if(mapp.get(s.charAt(left)) == 0){
                    mapp.remove(s.charAt(left));
                }
                left++;
            }
            max1 = Math.max(max , right - left + 1);
        }
        return max1;
        
    }
}