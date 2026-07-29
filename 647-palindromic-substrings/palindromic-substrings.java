class Solution {
    public boolean isp(String s) {
        int l=0;
        int r=s.length()-1;
        while(l<r) {
            if (s.charAt(l)!=s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int l=0;
        int c=0;
        while(l<s.length()){
            for(int r=l;r<s.length();r++){
                if (isp(s.substring(l,r+1)))c++;
            }
            l++;
        }
        return c;
    }
}