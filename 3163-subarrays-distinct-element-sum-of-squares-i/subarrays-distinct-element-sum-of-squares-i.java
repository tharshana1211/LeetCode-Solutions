class Solution {
    public int sumCounts(List<Integer> nums) {
        int n=0;
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                HashSet<Integer> set=new HashSet<>();
                for (int k=i;k<=j;k++){
                    set.add(nums.get(k));
                }
                n+=Math.pow(set.size(),2);
                //System.out.println();
            }
        }
        return n;
    }
}