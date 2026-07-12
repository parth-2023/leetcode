class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for(int i=left; i<=right; i++){
            if(prime(Integer.bitCount(i))) res++;
        }
        return res;
    }
    public boolean prime(int n){
        if(n<2) return false;
        if(n==2) return true;
        if(n%2==0) return false;
        for(int i=3; i<=Math.sqrt(n); i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
}