class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        int count=0;
        for(int i=0; i<32; i++){
            if(((n>>i)&1)==1) count++;
            if(count==2) return false;
        }
        return true;
    }
}