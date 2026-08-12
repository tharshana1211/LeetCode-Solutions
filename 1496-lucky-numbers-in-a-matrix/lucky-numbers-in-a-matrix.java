class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        List<Integer> l=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<mat.length;i++){
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            int id=0;
            for(int j=0;j<mat[0].length;j++){
                if (mat[i][j]<min){
                    min=mat[i][j];
                    id=j;
                }
            }
            for(int k=0;k<mat.length;k++){
                if (mat[k][id]>max){
                    max=mat[k][id];
                }
            }
            if (min==max){
                l.add(max);
                return l;
            }
        }
        return l;
    }
}