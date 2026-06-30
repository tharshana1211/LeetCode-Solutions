class Solution {
    public int numberOfSubstrings(String s) {
        int c=0;
        // for (int r=0;r<s.length();r++){
        //     HashSet<Character> set=new HashSet<>();
        //     for (int j=r;j<s.length();j++){
        //         if (set.contains(s.charAt(j)) && set.size()==3)c++;
        //         else {
        //             set.add(s.charAt(j));
        //             if (set.size()==3) c++;
        //         }
        //     }
        // }

        int l=0;
        int a[]=new int[3];
        for(int r=0;r<s.length();r++){
            a[s.charAt(r)-'a']++;
            while(a[0]>0 && a[1]>0 && a[2]>0){
                c+=s.length()-r;
                a[s.charAt(l)-'a']--;
                l++;
            }
        }
        return c;
    }
}