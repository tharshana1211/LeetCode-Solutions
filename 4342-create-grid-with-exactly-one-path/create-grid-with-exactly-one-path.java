class Solution {
    public String[] createGrid(int m, int n) {
        char[][] a=new char[m][n];

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]='#';
            }
        }

        a[0][0]='.';
        for (int i=0;i<m;i++) a[i][0]='.';
        for (int i=0;i<n;i++) a[m-1][i]='.';

        String[] b=new String[m];
        int v=0;
        for (int i=0;i<m;i++){
            String c="";
            for (int j=0;j<n;j++){
                c+=a[i][j];
            }
            b[v]=c;
            v++;
        }
        //for (int i=0;i<b.length;i++) System.out.println(b[i]);
        return b;
    }
}