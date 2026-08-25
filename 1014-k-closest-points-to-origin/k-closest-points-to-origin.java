

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Queue<int[]> q= new PriorityQueue<int[]>((p1, p2)->(p2[0]*p2[0]+p2[1]*p2[1])-(p1[0]*p1[0]+p1[1]*p1[1]));
        for(int[] point:points){
            q.offer(point);
            if(q.size()>k) q.poll();
        }
        int[][]res= new int[k][2];
        while(k>0)
        {
            res[--k]=q.poll();
        }
        return res;
    }
}