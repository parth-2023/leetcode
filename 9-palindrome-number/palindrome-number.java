class Solution {
    public boolean isPalindrome(int x) {
        int z=x;
        if(x<0){return false;}
        int y; int rev=0;
        while(x!=0){
            y=x%10;
            x=x/10;
            rev=(10*rev)+y;
        }
        return z==rev;
    }
}