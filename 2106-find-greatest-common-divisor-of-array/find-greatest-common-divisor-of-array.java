class Solution {
    public int check(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public int findGCD(int[] nums) {
        int m1=Integer.MAX_VALUE;
        int m2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            m1=Math.min(m1,nums[i]);
            m2=Math.max(m2,nums[i]);
        }

        return check(m1,m2);
    }
}