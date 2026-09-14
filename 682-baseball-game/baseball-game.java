class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st= new Stack<>();
        for(String s:operations){
            if(s.contains("+")){
                int last=st.pop();
                int seclast=st.peek();
                st.push(last);
                st.push(last+seclast);
            }
            else if(s.contains("C"))st.pop();
            else if(s.contains("D"))st.add(st.peek()*2);
            else st.push(Integer.valueOf(s));
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}