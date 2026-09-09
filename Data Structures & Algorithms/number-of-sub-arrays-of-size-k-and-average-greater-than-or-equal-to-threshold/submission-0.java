class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int dummy = 0 , count = 0, sum = 0;
        for(int right = 0 ;right < arr.length ; right++)
        {
            if(right - left + 1 == k)
            {
                sum = 0;
                 while(dummy <= right){
                    sum =sum + arr[dummy];
                    dummy++;
                 }
                 System.out.println(sum);
                 int a = sum /(right - left + 1);
                 if(a >= threshold){
                    count++;
                 }
                 left++;
                 dummy = left;
            }
        }
        return count;

        
    }
}