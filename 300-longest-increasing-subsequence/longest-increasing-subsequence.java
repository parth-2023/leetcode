class Solution {
    public int lengthOfLIS(int[] nums) {
        List<Integer> list= new ArrayList<>();
        for(int n:nums){
            if(list.isEmpty()||n>list.get(list.size()-1)){
                list.add(n);
            }
            else{
                list.set(bin(list, n), n);
            }
        }
        return list.size();
    }
    public static int bin(List<Integer> arr, int num){
        int left=0; int right=arr.size()-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr.get(mid)<num) left=mid+1;
            else if(arr.get(mid)>num)right=mid-1;
            else return mid;
        }
        return left;
    }
}