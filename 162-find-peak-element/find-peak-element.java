class Solution {
    public int findPeakElement(int[] nums) {
        int l=0,r=nums.length-1;
        if (nums.length==1) return 0;
        while(l<r){
            int m=l+(r-l)/2;
            //if (nums[m]>nums[m-1] && nums[m]>nums[m+1]) return m;
            if (nums[m]>nums[m+1]) r=m;
            else l=m+1;
        }
        return l;
    }
}