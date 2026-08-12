class Solution {
    public int[][] transpose(int[][] mat) {
        int[][] v=new int[mat[0].length][mat.length];
        for(int i=0;i<mat[0].length;i++){
            for(int j=0;j<mat.length;j++){
                v[i][j]=mat[j][i];
            }
        }
        return v;
    }
}