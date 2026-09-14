class Solution {
    public int[] numberGame(int[] nums) {
        Queue<Integer> q= new PriorityQueue<>();
        int[] arr= new int[nums.length];
        for(int i: nums){
            q.offer(i);
        }
        for(int i=0; i<nums.length; i+=2){
            int alice= q.poll();
            int bob= q.poll();
            arr[i]=bob;
            arr[i+1]=alice;
        }
        return arr;
    }
}