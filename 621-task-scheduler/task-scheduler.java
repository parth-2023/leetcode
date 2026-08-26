class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count=new int[26];
        int maxf=0;
        for(char a:tasks){
            count[a-'A']++;
            maxf=Math.max(maxf, count[a-'A']);
        }
        int sameMaxf=0;
        for(int cnt:count){
            if(cnt==maxf)sameMaxf++;
        }
        return Math.max(tasks.length, (maxf-1)*(n+1)+sameMaxf);
    }
}