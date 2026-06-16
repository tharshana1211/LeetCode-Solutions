class Solution {
    public int findMin(int[] arr) {
        if (arr.length==1) return arr[0];
        int min=Integer.MAX_VALUE;
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            min=Math.min(arr[m],min);
            if (arr[m]>=arr[l]){
                min=Math.min(arr[l],min);
                l=m+1;
            }
            else{
                min=Math.min(arr[r],min);
                r=m-1;
            }
        }
        return min;
    }
}