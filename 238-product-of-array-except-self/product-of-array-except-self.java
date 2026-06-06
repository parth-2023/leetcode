class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pre=1; int[] result=new int[nums.length];
        for(int i=0; i<nums.length;i++){
            result[i]=pre;
            pre*=nums[i];
        }
        int suf=1;
        for(int i=nums.length-1; i>=0; i--){
            result[i]*=suf;
            suf*=nums[i];
        }
        return result;
    }
}