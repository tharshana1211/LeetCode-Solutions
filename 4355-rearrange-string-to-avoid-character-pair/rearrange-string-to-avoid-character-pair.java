class Solution {
    public String rearrangeString(String s, char x, char y) {
         StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(x==ch)sb.append(ch);
            else if(y==ch)sb1.append(ch);
            else sb2.append(ch);
        }

        return sb1.toString()+sb2.toString()+sb.toString();
    }
}