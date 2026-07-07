class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int t=nums.length/2;
        for (int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }

        for (int j:m.keySet()){
            if (m.get(j)>t) return j;
        }
        return 0;
    }
}