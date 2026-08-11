class Solution {
    public int[][] generateMatrix(int n) {
        if(n==0)return new int[0][0];
        int [][]m=new int[n][n];
        int l=0,r=n-1;
        int t=0,b=n-1;
        int num=1;
        while(l<=r&& t<=b){
            for(int i=l;i<=r;i++){
                m[t][i]=num++;
            }
            t++;
            for(int i=t;i<=b;i++){
                m[i][r]=num++;
            }
            r--;
            if(t<=b){
                for(int j=r;j>=l;j--) m[b][j]=num++;
                b--;
            }
            if(l<=r){
                for(int j=b;j>=t;j--) m[j][l]=num++;
                l++;
            }
        }
        return m;
    }
}