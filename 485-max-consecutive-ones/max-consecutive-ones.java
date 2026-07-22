class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c=0,m=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]==0){
                c=Math.max(m,c);
                m=0;
            }
            else m++;
        }
        c=Math.max(m,c);
        return c;
    }
}