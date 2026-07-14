class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int l=0,sum=0,c=0;
        /*for (int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum==goal){
                c+=r-l+1;
                sum-=nums[l];
                l++;
            }
        }
        return c;*/
        int d=0;
        for(int i=0;i<nums.length;i++){
            sum=0;
            for(int j=i;j<nums.length;j++){
               sum+=nums[j];
               if (sum==goal) d++; 
            }
        }
        return d;
    }
}