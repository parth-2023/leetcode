class Solution {
    public int countSubstrings(String s) {
        int res=0;
        for(int i=0; i<s.length(); i++){
            int odd=pal(i,i,s);
            int even=pal(i, i+1, s);
            res+=odd+even;
        }
        return res;
    }
    public int pal(int left, int right, String s){
        int count=0;
        while(left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;right++;count++;
        }
        return count;
    }
}