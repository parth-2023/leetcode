class Solution {
    public int rob(int[] nums) {
        int max=0;
        int prev=0;
        for(int i: nums){
            int temp=Math.max(max, prev+i);
            prev=max;
            max=temp;
        }
        return max;
    }
}