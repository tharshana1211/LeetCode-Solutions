class Solution {
    public int minimumRecolors(String b, int k) {
        int l=0,c=0,a=Integer.MAX_VALUE;
        for (int r=0;r<b.length();r++){
            if (b.charAt(r)=='W')c++;
            while(r-l+1>k){
                if (b.charAt(l)=='W')c--;
                l++;
            }
            if (r-l+1==k){
                a=Math.min(a,c);
            }
        }
        return a;
    }
}