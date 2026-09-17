class Solution {
    public int calPoints(String[] operations) {
        Stack <Integer> sc = new Stack<>();
        int  p = 2 , sum = 0 , sum1 = 0;
        for(String s : operations){
            if(s.equals("+")){
                    int a = sc.pop();
                    int b = sc.pop();
                    sum = a+ b;
                 
                 sc.push(b);
                 sc.push(a);
                 sc.push(sum);
                 
            }
            else if(s.equals("C")){
                if(sc.size() > 0){
                    sc.pop();
                }
            }
            else if(s.equals("D")){
                if(sc.size() > 0){
                    sc.push(2 * sc.peek());
                }
               
            }
            else{
                sc.push(Integer.parseInt(s));
            }
        }
        System.out.println(sc);
      while(!sc.isEmpty()){
        sum1 = sum1 + sc.pop();
      }
      return sum1;
        
    }
}