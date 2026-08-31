class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> sc = new HashSet<>();
        for(int num : nums){
            sc.add(num);
        }
        int  i = 1;
        for( i = 1 ; i <= nums.length ; i++)
        {
            if(!sc.contains(i)){
                return i;
            }
        }
        return i;
        
    }
}