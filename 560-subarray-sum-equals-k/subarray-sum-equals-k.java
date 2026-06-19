class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int p[]=new int[nums.length];
        p[0]=nums[0];

        for (int i=1;i<nums.length;i++){
            p[i]=p[i-1]+nums[i];
        }
        int c=0;
        m.put(0,1);
        for(int i:p){
            int t=i-k;
            if (m.containsKey(t)) c+=m.get(t);
            m.put(i,m.getOrDefault(i,0)+1);
        }
        return c;
    }
}