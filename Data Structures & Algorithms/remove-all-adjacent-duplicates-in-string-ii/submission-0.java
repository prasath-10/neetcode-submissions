class Solution {
    public String removeDuplicates(String s, int k) {
       StringBuilder sb= new StringBuilder();
       Stack<int[]> sc = new Stack<>();
       for(int  i = 0 ; i < s.length() ; i++)
       {
            char ch = s.charAt(i);
            if(!sc.isEmpty() && sc.peek()[0] == ch){
                sc.peek()[1]++;
            }
            else{
                sc.push(new int [] {ch , 1});
            }
            if(sc.peek()[1] == k){
                sc.pop();
            }
       }
       while(!sc.isEmpty()){
           int [] top = sc.pop();
           sb.append(String.valueOf((char) top[0]).repeat(top[1]));
       }
       return sb.reverse().toString();
        
    }
}