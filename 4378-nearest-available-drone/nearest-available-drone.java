class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int t1=target[0];
        int t2=target[1];
        int id=-1;
        int max=9999;
        for (int i=0;i<drones.length;i++){
            int x=drones[i][0];
            int y=drones[i][1];
            int r=drones[i][2];
            int v=(Math.abs(x-t1) + Math.abs(y-t2));
            if (v<=r){
                if (v<max){
                    max=v;
                    id=i;
                }
            }
        }
        //return (id==0)?-1:id;
        return id;
    }
}