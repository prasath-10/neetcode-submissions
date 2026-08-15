class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> sc = new HashSet<>();
        for(String s : emails)
        {
            String [] str = s.split("@");
            String local = str[0];
            String end = str[1];
            local = local.split("\\+")[0];
            local = local.replace("." , "");
            sc.add(local + "@" + end);
            
        }
        
        return sc.size();
        
    }
}