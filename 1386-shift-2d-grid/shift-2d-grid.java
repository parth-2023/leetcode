class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[] arr= new int[grid[0].length*grid.length];
        int idx=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length;j++){
                arr[idx]=grid[i][j];
                idx++;
            }
        }
        for(int i=0; i<k; i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1; j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        idx=0;
        List<List<Integer>> list= new ArrayList<>();
        for(int i=0; i<grid.length;i++){
            List<Integer> inner= new ArrayList<>();
            for(int j=0; j<grid[0].length;j++){
                inner.add(arr[idx]);
                idx++;
            }
            list.add(inner);
        }
        return list;
    }
}