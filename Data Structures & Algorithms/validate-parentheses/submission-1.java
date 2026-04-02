class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else {
                if(stack.isEmpty()) {
                    return false;
                }
                char closing = stack.pop();
                if((closing == '(' && c == ')') || (closing == '{' && c == '}') || (closing == '[' && c == ']')) {
                    continue;
                }
                else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()) {
            return true;
        }
        return false;
    }
}
