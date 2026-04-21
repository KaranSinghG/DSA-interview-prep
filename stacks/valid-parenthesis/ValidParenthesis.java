class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
            } else if((stack.peek()=='(' && c==')') ||
                      (stack.peek()=='{' && c=='}') ||
                      (stack.peek()=='[' && c==']')){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
