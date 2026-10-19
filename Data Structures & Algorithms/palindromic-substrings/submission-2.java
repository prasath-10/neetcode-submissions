class Solution {
   // public boolean ispalindrome(int left , int right , String s){
    //     while(left <= right){
    //         if(s.charAt(left) != s.charAt(right)){
    //             return false;
    //         }
    //         left++;
    //         right--;
    //     }
    //     return true;
    // }
     public int countSubstrings(String s) {
    //     int count = 0;
    //     for(int  i = 0 ; i < s.length() ; i++)
    //     {
    //         for(int  j = i ; j < s.length() ; j++)
    //         {
    //             if(ispalindrome(i , j , s)){
    //                 count++;
    //             }
    //         }
    //     }
    //     return count;

    //optimal solution 
    int count = 0;
    for(int i = 0 ; i < s.length() ; i++)
    {
        int left = i;
        int right = i;
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }

        left = i;
         right = i + 1;
        while( left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            count++;
            left--;
            right++;
        }
       
    }
     return count;
        
    }
}