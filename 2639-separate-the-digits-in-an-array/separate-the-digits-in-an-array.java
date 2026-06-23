class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i:nums){
            String s= String.valueOf(i);
            for(char c: s.toCharArray()){
                list.add(c-'0');
            }
        }
        int[] answer= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i]=list.get(i);
        }
        return answer;
    }
}