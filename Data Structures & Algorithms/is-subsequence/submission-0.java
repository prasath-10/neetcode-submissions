class Solution {
    public boolean isSubsequence(String s, String t) {
        int left = 0;
        int right = 0 , count = 0;
        while(left < s.length() && right < t.length()){
            if(s.charAt(left) == t.charAt(right)){
                count++;
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return count == s.length() ? true : false;
        
    }
}