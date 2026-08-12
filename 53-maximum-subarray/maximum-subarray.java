class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];

        int s=nums[0],max=nums[0];
        for(int i=1;i<n;i++){
            s=Math.max(s+nums[i],nums[i]);
            max=Math.max(max,s);
        }
        return max;
    }
}