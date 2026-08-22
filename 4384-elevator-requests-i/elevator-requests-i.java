class Solution {
    public int elevatorRequests(int n, int[] r) {
        int m=r[0];
        for (int i=1;i<r.length;i++){
            m+=(Math.abs(r[i-1]-r[i]));
        }
        return m;
    }
}