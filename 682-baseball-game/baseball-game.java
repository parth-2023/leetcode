class Solution {
    public int calPoints(String[] operations) {
        int sum=0;
        List<Integer> list = new ArrayList<>();
        for(String s:operations){
            if(s.contains("+"))list.add(list.get(list.size()-1)+list.get(list.size()-2));
            else if(s.contains("C"))list.removeLast();
            else if(s.contains("D"))list.add(list.get(list.size()-1)*2);
            else list.add(Integer.valueOf(s));
        }
        for(int i:list){
            sum+=i;
        }
        return sum;
    }
}