class Solution {
    public String convertToTitle(int n) {
        String v="";
        while(n!=0){
            n--;
            v=(char)(65+(n%26))+v;
            n/=26;
        }
        return v;
    }
}