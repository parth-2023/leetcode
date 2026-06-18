class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int top=0;
        int bot=matrix.length-1;int row=0;
        while(top<=bot){
            int mid=(top+bot)/2;
            if(target>=matrix[mid][0] && target<=matrix[mid][matrix[0].length-1]){
                row=mid;
                break;
            }
            else if(target<matrix[mid][0]){
                bot=mid-1;
            }
            else{
                top=mid+1;
            }
        }
        int left=0; int right=matrix[0].length-1;
        while(left<=right){
            int midC=(left+right)/2;
            if(target==matrix[row][midC]) return true;
            else if(target>matrix[row][midC]) left=midC+1;
            else right=midC-1;
        }
        return false;
    }
}