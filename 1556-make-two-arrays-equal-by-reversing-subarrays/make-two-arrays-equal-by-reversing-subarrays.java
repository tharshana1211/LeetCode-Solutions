class Solution {
    public boolean canBeEqual(int[] a, int[] b) {
        Map<Integer, Integer> m=new HashMap<>();
        for (int i=0;i<a.length;i++) {
            m.put(a[i],m.getOrDefault(a[i],0)+1);
            m.put(b[i],m.getOrDefault(b[i],0)-1);
        }
        for (int i:m.keySet()) {
            if (m.get(i)!=0) return false;
        }
        return true;
    }
}