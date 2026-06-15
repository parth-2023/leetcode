class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        Map<Character, Integer> map= new HashMap<>();
        int left=0, maxlen=0;
        for(int r=0; r<n; r++){
            if(map.containsKey(s.charAt(r))&&map.get(s.charAt(r))>=left){
                left=map.get(s.charAt(r))+1;
            }
            map.put(s.charAt(r), r);
            maxlen= Math.max(maxlen, r-left+1);
        }
        return maxlen;
    }
}