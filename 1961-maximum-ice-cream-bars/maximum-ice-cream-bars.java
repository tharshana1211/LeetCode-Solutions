class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int b=coins,c=0;
        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(b>=costs[i]){
                b-=costs[i];
                c++;
            }
            if (b==0) break;
        }
        return c;
    }
}