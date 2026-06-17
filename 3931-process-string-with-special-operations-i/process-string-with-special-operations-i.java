class Solution {
    public String processStr(String s) {
        StringBuilder res=new StringBuilder();
        for(char i:s.toCharArray()){
            if (i=='*') {
                if (res.length() > 0) {
                    res.deleteCharAt(res.length() - 1);
                }
            }
            else if (i=='%') res=res.reverse();
            else if (i=='#') res.append(res);
            else res.append(i);
        }
        return res.toString();
    }
}