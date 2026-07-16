class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        // int a[]=new int[nums.length];
        // int j=0;
        // for(int i:nums){
        //     if(i%2==0) a[j++]=0;
        //     else a[j++]=1;
        // }
        return fun(nums,k)-fun(nums,k-1);
    }

    public int fun(int[] nums, int k){
        if (k<0) return 0;
        int l=0,r=0,s=0,c=0;

        while(r<nums.length){
            s+=(nums[r]%2!=0)?1:0;
            while(s>k){
                s-=(nums[l]%2!=0)?1:0;
                l++;
            }
            c+=(r-l+1);
            r++;
        }
        return c;
    }
}