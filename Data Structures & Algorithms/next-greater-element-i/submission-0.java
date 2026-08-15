class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int max = -1 , index = 0;
        int [] arr = new int[nums1.length];
        for(int  i = 0 ; i < nums1.length ; i++)
        {
             max = -1;
            for(int  j = 0 ; j < nums2.length ; j++)
            {
                if(nums1[i] == nums2[j]){
                    for(int  k = j + 1 ; k < nums2.length ; k++)
                    {
                        if(nums2[k] > nums1[i]){
                            max = nums2[k];
                            break;
                        }
                    }
                    arr[index++] = max;
                }
            }
        }
        return arr;
        
    }
}