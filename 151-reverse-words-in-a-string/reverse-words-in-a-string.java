class Solution {
    public String reverseWords(String s) {
        String v=s.trim();
        String n[]=v.split("\\s+");
        String b="";
        for (int i=n.length-1;i>=0;i--){
            b+=n[i];
            if (i!=0) b+=" ";
        }
        return b;
    }
}