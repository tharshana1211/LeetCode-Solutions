class Solution {
    public int minPenalty(int period, int[] lights, int[] a) {
        int w=-1,t=0,max=0;
        for (int i:lights) max=Math.max(i,max);
        for (int i=0;i<a.length;i++){
            int r=a[i]%period;
            if (r<max)t=0;
            else t=period-r;
            w=Math.max(w,t);
        }
        return w;
    }
}