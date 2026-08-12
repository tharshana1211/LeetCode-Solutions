class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int x=nums[i];
            int y=0;
            while(x!=0){
                int r=x%10;
                y++;
                x/=10;
            }
            if(y%2==0)c++;
        }
        return c;
    }
}