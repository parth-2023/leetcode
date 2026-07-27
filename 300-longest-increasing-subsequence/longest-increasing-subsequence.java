class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list= new ArrayList<>();
        
        for(int n:nums){
            if(list.isEmpty()||n>list.get(list.size()-1)){
                list.add(n);
            }
            else{
                list.set(Bin(list, n), n);
            }
        }
        return list.size();
    }
    public static int Bin(List<Integer> nums, int num){
        int left=0; int right=nums.size();
        while(left<=right){
            int mid=(right+left)/2;
            if(num>nums.get(mid)) left=mid+1;
            else if(num<nums.get(mid)) right=mid-1;
            else return mid;
        }
        return left;
    }
}