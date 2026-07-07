class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,a=0;
        while(l<r){
            int w=r-l;
            int len=Math.min(height[l],height[r]);
            a=Math.max(a,w*len);
            if (height[l]>height[r]) r--;
            else l++;
        }
        return a;
    }
}