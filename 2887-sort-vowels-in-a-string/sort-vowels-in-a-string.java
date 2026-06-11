class Solution {
    public String sortVowels(String s) {
        String vs="aeiouAEIOU";
        List<Character> l=new ArrayList<>();
        int j=0;
        for(char i:s.toCharArray()){
            if (vs.indexOf(i)!=-1) l.add(i);
        }
        Collections.sort(l);
        int k=0;
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if (vs.indexOf(i)!=-1) sb.append(l.get(k++));
            else sb.append(i);
        }
        return sb.toString();
    }
}