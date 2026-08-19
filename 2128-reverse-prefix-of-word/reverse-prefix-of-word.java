class Solution {
    public String reversePrefix(String word, char ch) {
        boolean v=false;
        StringBuilder a= new StringBuilder();
        int j=0;
        while(j<word.length()-1 && word.indexOf(ch)!=-1  && word.charAt(j)!=ch) {
            a.append(word.charAt(j++));
            v=true;
        }
        a.append(ch);
        a.reverse();
        a=a.append(word.substring(j+1));
        return (v)?a.toString():word;
    }
}