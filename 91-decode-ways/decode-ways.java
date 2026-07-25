class Solution {
    public int numDecodings(String s) {
        int n= s.length();
        if(s.charAt(0)=='0'||n==0) return 0;
        if(n==1) return 1;
        int d1=s.charAt(0)-'0';
        int d2=s.charAt(1)-'0';

        int[]dp= new int[n];
        int num=d1*10+d2;
        dp[0]= d1>0?1:0;
        dp[1]= d2>0?1:0;
        dp[1]+=num>=10 && num<=26?1:0;

        for(int i=2;i<n; i++){
            d1=s.charAt(i-1)-'0';
            d2=s.charAt(i)-'0';

            num=d1*10+d2;
            int sum= d2>0?dp[i-1]:0;
            sum+=num>=10 && num<=26?dp[i-2]:0;
            dp[i]=sum;
        }
        return dp[n-1];
    }
}