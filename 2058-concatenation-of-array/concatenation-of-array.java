class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]=new int[nums.length+nums.length];
        int j=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = nums[i % nums.length];
        }

        return a;
    }
}