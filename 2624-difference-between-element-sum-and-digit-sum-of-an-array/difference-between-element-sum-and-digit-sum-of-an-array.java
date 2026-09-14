class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digiSum=0;
        for(int i:nums){
            eleSum+=i;
            digiSum+=sumofdigits(i);
        }
        return eleSum-digiSum;
    }
    public int sumofdigits(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
}