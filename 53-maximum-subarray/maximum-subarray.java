class Solution {
    public int maxSubArray(int[] nums) {
        int gsum=-99999;
        int lsum=0;
        for(int num:nums){
            lsum+=num;
            gsum= gsum<lsum ? lsum:gsum;
            if (lsum<0) lsum=0;
        }
        return gsum;
    }
}