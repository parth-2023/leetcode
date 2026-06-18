class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left=1;
        int right=0;
        for(int i:piles){
            right=Math.max(right, i);
        }
        int ans=right;
        while(left<=right){
            long hours=0;
            int mid=(left+right)/2;
            for(int i: piles){
                hours+=(i+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                right=mid-1;
            }
            else left=mid+1;
        }
        return ans;
    }
}