class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int  i = 0 ; i < numRows ; i++)
        {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            int val =1;
            for(int  k =1 ; k <= i ;  k++)
            {
                val = val * (i - k + 1)/k;
                temp.add(val);
            }
            ans.add(temp);
        }
        return ans;
        
    }
}