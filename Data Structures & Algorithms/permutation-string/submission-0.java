class Solution {
    public boolean checkInclusion(String s1, String s2) {
      
        int left = 0;
        for(int right = 0 ;right < s2.length() ; right++)
        {
            if(right - left + 1 == s1.length()){
                String s = s2.substring(left , right + 1);
                char [] str = s.toCharArray();
                char [] str1 = s1.toCharArray();
                Arrays.sort(str);
                Arrays.sort(str1);
                if(Arrays.equals(str ,str1)){
                    return true;
                }
                left++;
            }
        }
        return false;
        
    }
}