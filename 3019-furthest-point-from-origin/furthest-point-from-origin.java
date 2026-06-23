class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int r=0; int l=0; int dash=0;
        for(char c:moves.toCharArray()){
            if(c=='L') l++;
            else if(c=='R') r++;
            else dash++;
        }
        return Math.max(l,r)+dash-Math.min(l,r);
    }
}