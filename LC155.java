class MinStack {
    Stack<Integer>MainStack;
    Stack<Integer>MinStack;
    public MinStack() {
        MainStack = new Stack<>();
        MinStack = new Stack<>();
    }
    
    public void push(int val) {
        MainStack.push(val);
        if(MinStack.isEmpty() || val<=MinStack.peek())MinStack.push(val);
    }
    
    public void pop() {
        int removed = MainStack.pop();
        if(removed == MinStack.peek()) {
            MinStack.pop();
        }
    }
    
    public int top() {
        return MainStack.peek();
    }
    
    public int getMin() {
        return MinStack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */