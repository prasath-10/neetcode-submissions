class Solution {
    public int lengthOfLastWord(String s) {
       String [] str = s.split("\\s+");
        for(int i = str.length - 1 ; i >= str.length - 1 ; i--){
                return  str[i] .length();
        }
        return 0;
        
    }
}