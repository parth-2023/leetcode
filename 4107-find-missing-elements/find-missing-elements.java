class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for(int i:nums){
            max= Math.max(max, i);
            min= Math.min(min, i);
        }
        List<Integer> list= new ArrayList<>();
        int[] arr= new int[max+1];
        for(int i:nums){
            arr[i]++;
        }
        for(int i=min; i<max; i++){
            if(arr[i]==0) list.add(i);
        }
        return list;
    }
}