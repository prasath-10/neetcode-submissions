class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> sc = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            sc.add(num);
        }
        for(int  i = 1 ; i <= nums.length ; i++)
        {
            if(!sc.contains(i)){
                list.add(i);
            }
        }
        return list;
        
    }
}