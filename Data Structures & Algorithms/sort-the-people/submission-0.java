class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        for(int  i = 0 ; i < names.length ; i++)
        {
            mapp.put(i , heights[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>(mapp.keySet());
        Collections.sort(ans , (a,b) -> {
             return mapp.get(b) - mapp.get(a);
        });
        System.out.println(ans);
        String [] arr = new String[ans.size()];
        for(int  i = 0 ; i < ans.size() ; i++)
        {
            int a = ans.get(i);
            arr[i] = names[a];
        }
        return arr;
        
    }
}