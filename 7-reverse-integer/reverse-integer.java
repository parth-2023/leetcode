class Solution {
    public int reverse(int num) {
    long rev=0; boolean neg=false;
        if(num<0){
            num*= -1;
            neg= true;
        }

        while(num>0){
            rev=num%10 + 10*rev;
            num/=10;
        }
        if(rev> Integer.MAX_VALUE) return 0;
        if(neg==true) return (int)-rev;
        return (int)rev;
    }
}