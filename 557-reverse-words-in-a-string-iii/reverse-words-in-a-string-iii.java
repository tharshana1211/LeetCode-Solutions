class Solution {
    public String reverseWords(String s) {
        String l[]=s.split(" ");
        String a="";
        for (String i:l){
            for(int j=i.length()-1;j>=0;j--){
                a+=i.charAt(j);
            }
            a+=" ";
        }
        return a.trim();
    }
}