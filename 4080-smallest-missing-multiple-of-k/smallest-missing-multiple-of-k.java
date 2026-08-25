class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set= new HashSet<>();
        int max=0;
        for(int i:nums){
            if(i%k==0) set.add(i);
        }
        int missing=k;
        while(set.contains(missing)) missing+=k;
        return missing;
    }
}