class Solution {
    public int maximumWealth(int[][] accounts) {
        int mostMoney=0;
        for(int i=0; i<accounts.length; i++){
            int moneyHeHas=0;
            for(int j=0; j<accounts[0].length; j++){
                moneyHeHas+=accounts[i][j];
            }
            mostMoney=Math.max(mostMoney, moneyHeHas);
        }
        return mostMoney;
    }
}