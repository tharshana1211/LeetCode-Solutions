class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int a[]=new int[mat.length];
        int b[]=new int[mat.length];
        int res[]=new int[k];
        int u=0,m=0;
        for(int i=0;i<mat.length;i++){
            int v=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)v++;
            }
            a[u++]=v;
            b[m++]=v;
        }
        Arrays.sort(b);
        u=0;
        for(int i=0;i<k;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    res[u++]=j;
                    a[j]=-1;
                    break;
                }
            }
        }
        return res;
    }
}