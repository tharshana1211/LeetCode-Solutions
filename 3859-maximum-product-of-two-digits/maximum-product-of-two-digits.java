class Solution {
    public int maxProduct(int n) {
        int m=n;
        int d=0;
        while(m!=0){
            d++;
            m/=10;
        }
        m=n;
        int j=d-1;
        int []a=new int[d];
        while(m!=0){
            a[j--]=m%10;
            m/=10;
        }
        Arrays.sort(a);
        return a[d-1]*a[d-2];
    }
}