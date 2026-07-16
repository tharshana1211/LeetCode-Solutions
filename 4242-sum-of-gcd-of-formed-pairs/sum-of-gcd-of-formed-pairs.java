class Solution {
    public int gcd(int a,int b){
        while(b!=0){
            int t=a%b;
            a=b;
            b=t;
        }
        return a;
    }
    public long gcdSum(int[] nums) {
        int m=nums[0];
        int a[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            m=Math.max(m,nums[i]);
            a[i]=gcd(nums[i],m);
        }
        Arrays.sort(a);
        long s=0;
        int l=0,r=a.length-1;
        while(l<r){
            int c=gcd(a[l],a[r]);
            s+=c;
            l++;
            r--;
        }
        
        return s;
    }
}