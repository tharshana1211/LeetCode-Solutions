class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> m=new HashSet<>();
        for (int i:nums) m.add(i);
        List<Integer> l=new ArrayList<>();
        for (int i=1;i<=nums.length;i++){
            if (!m.contains(i)) l.add(i);
            
        }
        return l;
    }
}