class Solution {
    public String removeStars(String s) {
       Stack<Character> st=new Stack<>();
       for(char i:s.toCharArray()){
        if(i=='*')st.pop();
        else st.push(i);
       } 
       String h="";
       while(!st.isEmpty()){
        h=st.pop()+h;
       }
       return h;
    }
}