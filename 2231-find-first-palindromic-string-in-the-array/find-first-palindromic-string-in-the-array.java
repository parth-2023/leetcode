class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPal(s)==true) return s;
        }
        return "";
    }
    public boolean isPal(String s){
        int left=0, right= s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false;
            left++; right--;
        }
        return true;
    }
}