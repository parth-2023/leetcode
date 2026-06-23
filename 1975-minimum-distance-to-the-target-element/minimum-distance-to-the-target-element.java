class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int id=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target&& Math.abs(start-id)>Math.abs(start-i)){
                id=i;
            }

        }
        return Math.abs(start-id);
    }
}