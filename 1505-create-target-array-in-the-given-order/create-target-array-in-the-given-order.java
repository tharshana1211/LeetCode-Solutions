class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> l=new ArrayList<>();
        int k=0;
        for (int i:index){
            l.add(i,nums[k++]);
        }
        int r[]=new int[nums.length]; 
        k=0;
        for (int j:l){
            r[k++]=j;
        }
        return r;
    }
}