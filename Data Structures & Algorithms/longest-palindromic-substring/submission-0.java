class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        int index = 0 ,  index1 = 0;
        for(int i = 0 ; i < s.length() ; i++)
        {
            int left = i;
            int right = i;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                  int length = right - left  + 1;
                  if(length >= max){
                    max = length;
                    index = left;
                    index1 = right;
                    
                  }
                  left--;
                 right++;
            }  
            left = i;
            right = i +1;
            while(left >=0  && right < s.length() && s.charAt(left) == s.charAt(right)){
                int length = right - left + 1;
                if(length >= max){
                    max = length;
                    index= left;
                    index1 = right;
                    
                }
                left--;
                 right++;
            }
        }
        return s.substring(index , index1 +1);
        
    }
}
