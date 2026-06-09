class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int x[]=new int[nums.length];
        int l=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<pivot) x[l++]=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]==pivot) x[l++]=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            if (nums[i]>pivot) x[l++]=nums[i];
        }
        return x;
    }
}