class Solution {
    public int minOperations(String[] logs) {
        int count = 0;
        Stack<String> sc = new Stack<>();
        for(String s : logs){
            if(s.equals("../")){
                if(count > 0){
                    count --;
                }
            }
            else if(s.equals("./")){
                 count =count;
            }
            else{
                count++;
            }
        }
        return count;
        
    }
}