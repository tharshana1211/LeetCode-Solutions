class Solution {
    public String sortSentence(String s) {
        String[] t=s.split(" ");
        String []a=new String[t.length];
        for (String i:t){
            String num=""+i.charAt(i.length()-1);
            int n=Integer.parseInt(num);
            a[n-1]=i.substring(0,i.length()-1);
        }
        return String.join(" ",a);
    }
}