class Solution {
    public int firstUniqChar(String s) {
        int[] count= new int[26];
        for(int i=0; i<s.length();i++){
            count[s.charAt(i)-'a']++;
            String c=String.valueOf(s.charAt(i));
            if(!s.substring(i+1).contains(c)&&count[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}