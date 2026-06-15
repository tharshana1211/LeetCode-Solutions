class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1  || s.length()<=numRows) return s;

        StringBuilder[] rows= new StringBuilder[numRows];
        for(int i=0;i<numRows;i++) rows[i]=new StringBuilder();

        int cr=0;
        boolean goingdown=false;

        for(char c:s.toCharArray()){
            rows[cr].append(c);
            if (cr==0 || cr==numRows-1) goingdown=!goingdown;
            cr+=goingdown?1:-1;
        }

        StringBuilder res=new StringBuilder();
        for(StringBuilder r:rows) res.append(r);
        return res.toString();

    }
}