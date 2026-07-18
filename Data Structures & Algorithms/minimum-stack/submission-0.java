class MinStack {
    Stack<Integer> actualStack;
    Stack<Integer> extraStack;
    public MinStack() {
        actualStack = new Stack<>();
        extraStack = new Stack<>();
    }
    
    public void push(int val) {
        actualStack.push(val);
        if(extraStack.empty() || val<= extraStack.peek()){
            extraStack.push(val);
        }

    }
    
    public void pop() {
        if(!actualStack.empty()){
            int temp = actualStack.pop();
            if(extraStack.peek()==temp){
                extraStack.pop();
            }
        }
        
        
    }
    
    public int top() {
        
        return actualStack.peek();
    }
    
    public int getMin() {
        
        return extraStack.peek();
    }
}
