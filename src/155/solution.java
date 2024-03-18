class MinStack {

    private Stack<Integer> items = new Stack<>(), mins = new Stack<>();

    public MinStack() {
    }
    
    public void push(int val) {
        items.push(val);
        if(mins.size()==0 || val <= mins.peek()){
            mins.push(val);
        }
    }
    
    public void pop() {
        int val = items.pop();
        if (val == mins.peek()){
            mins.pop();
        }
    }
    
    public int top() {
        return items.peek();
    }
    
    public int getMin() {
        return mins.peek();
    }
}