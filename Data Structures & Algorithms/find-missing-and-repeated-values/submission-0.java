class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer ,Integer> mapp = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        int n = grid.length , a = 0 , b = 0;
        for(int i = 0 ; i < grid.length ; i++)
        {
            for(int  j = 0 ; j < grid[0] . length ; j++)
            {
                if(mapp.containsKey(grid[i][j])){
                    mapp.put(grid[i][j] , mapp.get(grid[i][j])  + 1); 
                }
                else{
                    mapp.put(grid[i][j] , 1);
                }
                set.add(grid[i][j]);
            }
        }
        for(int  i = 1 ; i <= n * n ; i++)
        {
            if(mapp.get(i) != null && mapp.get(i) == 2){
                a = i;
            }
            if(!set.contains(i)){
                b = i;
            }
        }
        return new int[] { a , b};
        
        
    }
}