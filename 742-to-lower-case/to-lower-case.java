class Solution {
    public String toLowerCase(String s) {
        char[] c= s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(c[i])){
                c[i]=Character.toLowerCase(c[i]);
            }
        }
        return new String(c);
    }
}