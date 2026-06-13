class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String alpha="zyxwvutsrqponmlkjihgfedcba";
        StringBuilder res= new StringBuilder();
        for(String s: words){
            int number=0;
            for(int i=0; i<s.length(); i++){
                number+= weights[s.charAt(i) -'a'];
            }
            number%=26;
            res.append(alpha.charAt(number));
        }
        return res.toString();
    }
}