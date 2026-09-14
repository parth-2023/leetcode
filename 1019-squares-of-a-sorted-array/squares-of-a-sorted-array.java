class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res= new int[nums.length];
        int idx=0;
        for(int i: nums){
            res[idx]=i*i;
            idx++;
        }
        Arrays.sort(res);
        return res;
    }
}