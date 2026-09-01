class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int  i = 0 ; i < s.length() ; i++)
        {
            if(Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))){
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        System.out.println(sb);
        int left = 0;
        int right = sb.length() -1;
        while(left <= right){
            if(sb.charAt(left) != sb.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
        
    }
}
