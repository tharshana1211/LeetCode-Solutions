class Solution {
    public int totalFruit(int[] f) {
        HashMap<Integer,Integer> m=new HashMap<>();
        int l=0,ml=0;
        for(int r=0;r<f.length;r++){
            m.put(f[r],m.getOrDefault(f[r],0)+1);
            while (m.size()>2){
                m.put(f[l],m.get(f[l])-1);
                if (m.get(f[l])==0) m.remove(f[l]);
                l++;
            }
            ml=Math.max(ml,r-l+1);
        }
        return ml;
    }
}