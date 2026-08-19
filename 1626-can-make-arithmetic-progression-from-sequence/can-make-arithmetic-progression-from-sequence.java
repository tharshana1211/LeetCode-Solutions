class Solution {
    public boolean canMakeArithmeticProgression(int[] a) {
        Arrays.sort(a);
        int d=Math.abs(a[0]-a[1]);
        for(int i=1;i<a.length;i++){
            if (d!=(Math.abs(a[i]-a[i-1]))) return false;
        }
        return true;
    }
}