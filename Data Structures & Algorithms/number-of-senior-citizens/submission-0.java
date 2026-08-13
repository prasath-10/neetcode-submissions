class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int  i = 0 ; i < details.length ; i++)
        {
            char  [] s = details[i] . toCharArray();
            int a = s[11] - '0';
            int b = s[12]  - '0';
           int  sum = a * 10 + b;
            if(sum > 60){
                count++;
            }
        }
        return count;
        
    }
}