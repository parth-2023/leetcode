class Solution {
    public String triangleType(int[] nums) {
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        int min = Math.min(nums[0], Math.min(nums[1], nums[2]));
        int mid = nums[0] + nums[1] + nums[2] - max - min;
        if (min + mid <= max) return "none"; 
        if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]) return "scalene";
        if(nums[0]==nums[1]&&nums[0]==nums[2]&&nums[1]==nums[2]) return "equilateral";
        return "isosceles";
    }
}