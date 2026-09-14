class Solution {
    public int subtractProductAndSum(int n) {
        return product(n)-sum(n);
    }
    public int sum(int n){
        int sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }
    public int product(int n){
        int product=1;
        while(n>0){
            product*=n%10;
            n/=10;
        }
        return product;
    }
}