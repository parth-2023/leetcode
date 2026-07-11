class Solution {
    public int climbStairs(int n) {
        int[]ways=new int[45];
        ways[0]=1;
        ways[1]=2;
        for(int i=2; i<45; i++){
            ways[i]=ways[i-1]+ways[i-2];
        }
        return ways[n-1];
    }
}