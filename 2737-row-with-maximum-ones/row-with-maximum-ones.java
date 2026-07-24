class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int a[]=new int[2];
        a[0]=0;a[1]=0;
        int k=0;
        for(int[] i:mat){
            int c=0;
            for (int j=0;j<i.length;j++){
                if(i[j]==1)c++;
            }
            if(c>a[1]){
                a[0]=k;
                a[1]=c;
            }
            k++;
        }
        return a;
    }
}