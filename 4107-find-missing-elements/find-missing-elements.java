class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        //if((nums[nums.length-1]-nums[0]+1)==nums.length) return list;
        int first= nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i]>first) {
                list.add(first);
                i--;
            }
            first++;
        }
        return list;
    }
}