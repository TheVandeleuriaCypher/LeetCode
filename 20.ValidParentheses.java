class Solution {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++){
            switch (s.charAt(i)){
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                case '[':
                    stack.push(']');
                    break;
                default:
                    if ((stack.isEmpty()) || (stack.pop() != s.charAt(i)))
                        return false;
            }
        }
        if ((stack.isEmpty())==false)
            return false;
        return true;
    }
}
