class Solution {
    public String longestPalindrome(String s) {
        int start=0, end=0, n=s.length();
        for(int i=0; i<n; i++){
            int odd= palindrome(i, i, s);
            int even= palindrome(i, i+1, s);

            int max=Math.max(odd, even);
            if(max> end-start){
                end= i+max/2;
                start=i-(max-1)/2;
            }
        }
        return s.substring(start, end+1);
    }
    public static int palindrome(int left, int right, String s){
        while(left>=0 && right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
}