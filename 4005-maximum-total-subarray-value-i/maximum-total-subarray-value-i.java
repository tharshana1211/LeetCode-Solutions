class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int mx=Integer.MIN_VALUE;
        int mi=Integer.MAX_VALUE;
        for (int i=0;i<nums.length;i++){
            mx=Math.max(mx,nums[i]);
            mi=Math.min(mi,nums[i]);
        }

        return (long)(mx-mi)*k;
    }
}