class Solution {
    public int gcdOfOddEvenSums(int n) {
        if(n==0) return 0;
        int sumEven=2;
        int sumOdd=1;
        for(int i=2; i<=n; i++){
            sumEven+=(2*i);
            sumOdd+=(2*i)-1;
        }
        while(sumOdd!=0){
            int temp=sumOdd;
            sumOdd=sumEven%sumOdd;
            sumEven=temp;
        }
        return sumEven;
    }
}