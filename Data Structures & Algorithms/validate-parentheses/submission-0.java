class Solution {
    public boolean isValid(String s) {
         Stack<Character> sc = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening brackets
            if (c == '[' || c == '(' || c == '{') {
                sc.push(c);
            }

            // Closing bracket
            else {
                if (sc.isEmpty()) {
                    return false;
                }

                if (c == ']' && sc.peek() != '[') {
                    return false;
                }

                if (c == ')' && sc.peek() != '(') {
                    return false;
                }

                if (c == '}' && sc.peek() != '{') {
                    return false;
                }

                sc.pop();
            }
        }

        return sc.isEmpty();
    }
}
