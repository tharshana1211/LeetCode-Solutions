class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int max=0,id=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if (mat[i][j]>max){
                    max=mat[i][j];
                    id=j;
                }
            }
            int m=0,id2=0;
            for(int k=0;k<mat.length;k++){
                if(mat[k][id]>m){
                    m=mat[k][id];
                    id2=k;
                }
            }
            if(max==m)return new int[]{id2,id};
        }
        return new int[]{0};
    }
}