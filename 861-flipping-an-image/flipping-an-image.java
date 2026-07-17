class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        int a[][]=new int[image.length][image[0].length];

        for (int i=0;i<image.length;i++){
            int l=0,r=image[0].length-1;
            while(l<=r){
                int t=image[i][l];
                image[i][l]=image[i][r];
                image[i][r]=t;
                l++;
                r--;
            }
        }

        for (int i=0;i<image.length;i++) {
            for(int j=0;j<image[0].length;j++){
                if (image[i][j]==0) a[i][j]=1;
                else a[i][j]=0;
            }
        }

        return a;
    }
}