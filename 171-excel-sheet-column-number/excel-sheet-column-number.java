class Solution {
    public int titleToNumber(String t) {
        if (t.length()==1) return (t.charAt(0)-'A')+1;
        int n=0;
        for (int i=0;i<t.length();i++){
            n=n*26+((t.charAt(i)-'A')+1);
        }
        return n;
    }
}