class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> sc = new HashSet<>();
        HashSet<Integer> sc1 = new HashSet<>();
        int [] arr = new int[1000];
        int index = 0;
        for(int num : nums2){
            sc.add(num);
        }
         for(int num : nums1){
            sc1.add(num);
        }
        
        for(int num : sc1){
            if(sc.contains(num)){
                arr[index++] = num;
            }
        }
        return Arrays.copyOf(arr , index);
        
    }
}