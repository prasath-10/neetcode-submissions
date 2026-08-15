class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> mapp = new HashMap<>();
        for(String s : strs){
            char [] str = s.toCharArray();
            Arrays.sort(str);
            String sort = new String(str);
            if(!mapp.containsKey(sort)){
                mapp.put(sort , new ArrayList<>());
            }
             mapp.get(sort).add(s);

        }
        return new ArrayList<>(mapp.values());
        
    }
}
