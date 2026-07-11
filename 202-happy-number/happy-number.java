class Solution {
    public boolean isHappy(int n) {
        int slow= hihi(n);
        int fast= hihi(hihi(n));
        while(slow!=fast){
            if(fast==1) return true;
            slow= hihi(slow);
            fast=hihi(hihi(fast));
        }
        return slow==1;
    }
    int hihi(int n){
        int res=0;
        int x=0;
        while(n>0){
            x=n%10;
            res+=x*x;
            n/=10;
        }
        return res;
    }
}