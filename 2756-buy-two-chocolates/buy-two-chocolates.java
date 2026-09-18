class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int c=1;
        int x=money;
        int s=prices[0];
        for (int i=1;i<prices.length;i++){
            s+=prices[i];
            if (s<=money){
                return money-s;
            }
        }
        return (money!=0)?x:0;
    }
}