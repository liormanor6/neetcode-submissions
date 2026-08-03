class MinStack {

    Stack stack;
    Stack minElementStack;
    public MinStack() {
        stack = new Stack<Integer>();
        minElementStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        stack.push(val);
        if (minElementStack.empty())
            minElementStack.push(val);
        else
            minElementStack.push(Math.min(val, (int)minElementStack.peek()));
    }
    
    public void pop() {
        stack.pop();
        minElementStack.pop();
    }
    
    public int top() {
        return (int)stack.peek();
    }
    
    public int getMin() {
        return (int)minElementStack.peek();
    }
}
