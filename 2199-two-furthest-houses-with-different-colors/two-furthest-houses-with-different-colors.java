class Solution {
    public int maxDistance(int[] colors) {
        int left=0; int right=colors.length-1;
        int res=0;
        while(left<right){
            if(colors[left]!=colors[right]){
                res=right-left;
                break;
            }
            right--;
        }
        right=colors.length-1;
        while(left<right){
            if(colors[left]!=colors[right]){
                res=Math.max(res, right-left);
                break;
            }
            left++;
        }
        return res;
    }
}