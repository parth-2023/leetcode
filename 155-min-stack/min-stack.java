class MinStack {

        int[] st= new int[100000];
        int[] minst= new int[100000];
        int top=-1;
        int mintop=-1;
    
    public void push(int value) {
        st[++top]=value;
        if(mintop==-1||value<=minst[mintop]){
            minst[++mintop]=value;
        }
    }
    
    public void pop() {
        if(st[top]==minst[mintop]) mintop--;
        top--;
    }
    
    public int top() {
        return st[top];
    }
    
    public int getMin() {
        return minst[mintop];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */