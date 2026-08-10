class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length+nums.length];
        int j=0;
        for(int i=0;i<nums.length;i++){
            a[j++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            a[j++]=nums[i];
        }
        return a;
    }
}