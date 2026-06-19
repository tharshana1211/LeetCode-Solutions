class NumArray {
    int a[];
    public NumArray(int[] nums) {
        a=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            a[i]=nums[i];
        }
    }
    
    public int sumRange(int l, int r) {
        int p[]=new int[a.length];
        p[0]=a[0];
        for (int i=1;i<a.length;i++){
            p[i]=p[i-1]+a[i];
        }

        if (l==0) return p[r];
        return p[r]-p[l-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */