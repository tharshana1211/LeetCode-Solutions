import java.util.Arrays;
class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int pa[]=new int[26];
        int sa[]=new int[26];
        for (int i=0;i<p.length();i++){
            pa[p.charAt(i)-'a']++;
        }
        List<Integer> l=new ArrayList<>();
        if (p.length()>s.length()) return l;
        for(int i=0;i<p.length();i++){
            sa[s.charAt(i)-'a']++;
        }

        if (Arrays.equals(pa,sa)) l.add(0);
        int j=0;
        for (int i=p.length();i<s.length();i++){
            sa[s.charAt(j)-'a']--;
            
            sa[s.charAt(i)-'a']++;
            if (Arrays.equals(pa,sa)) l.add(j+1);
            j++;
        }
        return l;
    }
}