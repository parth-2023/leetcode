class Solution {
    public int largestAltitude(int[] gain) {
        int res=Integer.MIN_VALUE;
        int sum=0;
        for(int i:gain){
            sum+=i;
            res=Math.max(res, sum);
        }
        if(res<0) return 0;
        return res;
    }
}