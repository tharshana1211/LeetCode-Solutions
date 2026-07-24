class Solution {
    public boolean is(int n){
        if (n<=1) return false;
        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0) return false;
        }
        return true;
    }
    public int diagonalPrime(int[][] nums) {
        int m=0;
        for (int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if (i==j|| i==nums.length-j-1){
                    if (is(nums[i][j])) m=Math.max(nums[i][j],m);
                }
            }
        }
        return m;
    }
}