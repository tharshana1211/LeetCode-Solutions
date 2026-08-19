class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for (char i:s.toCharArray())
        {
            if ( (i==')' || i==']'|| i=='}') && st.empty())return false;
            else if (i=='(' || i=='['|| i=='{') st.push(i);
            else if ( (i==')' && st.peek()=='(') ||  (i==']' && st.peek()=='[') ||  (i=='}' && st.peek()=='{') )st.pop();
            else return false;
        }

        if (st.empty()) return true;
        return false;
    }
}