class Solution {
    public void sortColors(int[] nums) {
        int one = 0 , zero = 0 , two = 0;
        for(int num : nums){
            if(num == 1){
                one++;
            }
            else if(num == 2){
                two++;
            }
            else{
                zero++;
            }
        }
        int  i = 0;
        while(zero != 0){
            nums[i++] = 0;
            zero--;
        }
        while(one != 0){
            nums[i++] = 1;
            one--;
        }
        while(two != 0){
            nums[i++] = 2;
            two--;
        }

        
    }
}