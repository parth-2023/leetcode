class Solution {
    public int maxProduct(int n) {
        int max=0, max2=0;
        while(n>0){
            int temp=n%10;
            n/=10;
            if(max<temp){
                max2=max;
                max=temp;
            }
            else if(max2<temp) max2=temp;
        }
        return max*max2;
    }
}