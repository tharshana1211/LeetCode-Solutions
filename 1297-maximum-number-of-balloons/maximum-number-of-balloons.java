class Solution {
    public int maxNumberOfBalloons(String text) {
        // if (text.length()<7)return 0;
        // String t="balloon";
        // HashMap<Character,Integer> m=new HashMap<>();
        // for(char i:text.toCharArray()){
        //     m.put(i,m.getOrDefault(i,0)+1);
        // }

        // int min=Integer.MAX_VALUE;
        // for (char i:t.toCharArray()){
        //     if (m.containsKey(i)){
        //         min=Math.min(m.get(i),min);
        //     }
        //     return 0;
        // }
        // return (min==Integer.MAX_VALUE)?0:min;

        if (text.length() < 7) return 0;
        
        // 1. Count the frequency of each letter in the input text
        int[] counts = new int[26];
        for (char c : text.toCharArray()) {
            counts[c - 'a']++;
        }
        
        // 2. Find the limiting character
        // 'l' and 'o' are divided by 2 because "balloon" needs two of each
        int b = counts['b' - 'a'];
        int a = counts['a' - 'a'];
        int l = counts['l' - 'a'] / 2;
        int o = counts['o' - 'a'] / 2;
        int n = counts['n' - 'a'];
        
        // 3. The maximum number of balloons is determined by the minimum available letter
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}