class Solution {
    public boolean isValid(String s) {
        int length = s.length();
        if (length % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++)
        {
            Character curr = s.charAt(i);
            if (curr == '(' || curr == '[' || curr == '{') stack.push(curr);
            else if (stack.empty()) return false;
            else if (curr == ')' && stack.peek() == '(' || curr == ']' && stack.peek() == '[' || curr == '}' && stack.peek() == '{') stack.pop();
            else {
                return false;
            }
        }
        return stack.empty();
    }
}
