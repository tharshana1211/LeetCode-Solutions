class Solution {
    public boolean checkDivisibility(int n) {
        int d=0,p=1;
        int x=n;
        while(x!=0){
            int r=x%10;
            d+=r;
            p*=r;
            x/=10;
        }
        return (n%(d+p)==0)?true:false;
    }
}