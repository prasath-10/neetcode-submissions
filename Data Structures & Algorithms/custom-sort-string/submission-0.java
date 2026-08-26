class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character , Integer> mapp = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray())
        {
            if(mapp.containsKey(ch)){
                mapp.put(ch , mapp.get(ch) + 1);
            }
            else{
                mapp.put(ch , 1);
            }
        }
        for(char ch : order.toCharArray())
        {
            if(mapp.containsKey(ch)){
                int b = mapp.get(ch);
                while(b != 0){
                    sb.append(ch);
                    b--;
                }
                mapp.remove(ch);
            }
        }
        for(char ch : mapp.keySet()){
            int b = mapp.get(ch);
            while(b != 0){
                sb.append(ch);
                b--;
            }
        }
        return sb.toString();
        
    }
}