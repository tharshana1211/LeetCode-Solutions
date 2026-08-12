class Solution {
    public int[] sumZero(int n) {
        if (n==1) return new int[]{0};
        int a[]=new int[n];
        int in=0;
        if (n%2!=0)a[in++]=0;
        for(int i=1;i<=n/2;i++){
            a[in++]=i;
            a[in++]=-i;
        }
        return a;
    }
}