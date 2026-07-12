class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int max=0;
        for(int i=1; i<nums[0]+1; i++){
            if(nums[0]%i==0&&nums[nums.length-1]%i==0) max=i;
        }
        return max;
    }
}