class Solution {
    public String longestCommonPrefix(String[] strs) {
       String p="";
        for (int i=0;i<strs[0].length();i++){
            char m=strs[0].charAt(i);
            boolean v=true;
            for (int j=1;j<strs.length;j++){
                if (strs[j].length()<=i || m!=strs[j].charAt(i)){
                    v=false;
                    break;
                }
            }
            if (v) p+=m;
            else break;
        }
        return p;
    }
}