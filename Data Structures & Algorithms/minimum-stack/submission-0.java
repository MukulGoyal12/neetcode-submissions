class MinStack {

    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.size()==0){
            minSt.push(val);
        }else{
            if(val<=minSt.peek()){
                minSt.push(val);
            }
        }
    }
    
    public void pop() {
        if(!minSt.isEmpty()){
            int removed = st.pop();
            if (removed == minSt.peek()) {
                minSt.pop();
            }
        }
    }
    
    public int top() {
        if(!minSt.isEmpty())
            return st.peek();
        else return 0;
    }
    
    public int getMin() {
        return minSt.isEmpty() ? 0 : minSt.peek();
    }
}