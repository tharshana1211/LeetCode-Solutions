class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for (char i:s.toCharArray()){
            if (i=='(')st.push(0);
            else if (!st.isEmpty() && i==')'){
                int a=st.pop();
                int b=st.pop();
                int c=(a==0)?1:a*2;
                st.push(b+c);
            }
        }
        return st.pop();
    }
}