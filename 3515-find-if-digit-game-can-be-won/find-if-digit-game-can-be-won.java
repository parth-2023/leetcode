class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle=0, sumDouble=0;
        for(int i:nums){
            if(i>9) sumDouble+=i;
            else sumSingle+=i;
        }
        if(sumSingle==sumDouble) return false;
        return true;
    }
}