class Solution {
    public int[] buildArray(int[] nums) {
        int a[]=new int[nums.length];
        int j=0;
        for (int i=0;i<a.length;i++) {
            a[i]=nums[nums[i]];
        }
        return a;
    }
}