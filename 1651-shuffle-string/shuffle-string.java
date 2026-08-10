class Solution {
    public String restoreString(String s, int[] indices) {
        char []a=new char[s.length()];
        for(int i=0;i<s.length();i++){
            a[indices[i]]=s.charAt(i);
        }
        String v="";
        for (char i:a) v+=i;
        return v;
    }
}