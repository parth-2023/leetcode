class Solution {
    public boolean isGood(int[] nums) {
        Set<Integer> list= new HashSet<>();
        int count=1;
        for(int i:nums){
            if(i>=nums.length) return false;
            if(!list.contains(i)) list.add(i);
            else if(i!=nums.length-1) return false;
            else{
                if(count==2) return false;
                count++;
            }
        }
        return true;
    }
}