class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String ,Integer> mapp = new HashMap<>();
        int count = 0;
        for(int  i = 0 ; i < arr.length ; i++)
        {
            if(mapp.containsKey(arr[i])){
                mapp.put(arr[i] , mapp.get(arr[i]) + 1);
            }
            else{
                mapp.put(arr[i] , 1);
            }
        }
        for(int  i = 0 ; i < arr.length; i++)
        {
            if(mapp.get(arr[i]) == 1)
            {
                count++;
                if(count == k){
                    return arr[i];
                }
            }
        }
        return "";
        
    }
}