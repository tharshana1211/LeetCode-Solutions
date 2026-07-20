class Solution {
    public void check(int[] a,int k){
        int n=a.length;
        k=k%n;
        rev(a,0,n-1);
        rev(a,0,k-1);
        rev(a,k,n-1);
    }

    public void rev(int a[],int s,int e){
        int l=s,r=e;
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> l= new ArrayList<>();
        int a[]=new int[grid.length*grid[0].length];
        int u=0;
        for (int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a[u++]=grid[i][j];
            }
        }

        check(a,k);
        int m=0;
        for (int i=0;i<grid.length;i++){
            ArrayList<Integer> p=new ArrayList<>();
            for(int j=0;j<grid[0].length;j++){
                p.add(a[m++]);
            }
            l.add(p);
        }

        return l;
    }
}