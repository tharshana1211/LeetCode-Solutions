class Solution {
    public boolean isPalindrome(String s) {
        String v="";
        for(int i=0;i<s.length();i++) if(Character.isLetterOrDigit(s.charAt(i)))v+=s.charAt(i);
        v=v.toLowerCase();
        int l=0,r=v.length()-1;
        while(l<r){
            if (v.charAt(l)!=v.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}