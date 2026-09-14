class Solution {
    public int mostWordsFound(String[] sentences) {
        int spaces=0;
        for(String i: sentences){
            int temp=0;
            for(char c:i.toCharArray()){
                if(c==' ') temp++;
            }
            spaces=Math.max(temp, spaces);
        }
        return spaces+1;
    }
}