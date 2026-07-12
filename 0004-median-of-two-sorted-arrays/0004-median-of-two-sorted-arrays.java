class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int z=m+n;
        int[]nums3=new int[z];
        for(int i=0; i<m; i++){
            nums3[i]=nums1[i];
        }
        for(int i=0; i<n; i++){
            nums3[m+i]=nums2[i];
        }
        Arrays.sort(nums3);
        double x;
        if(z%2==0){
            x=(nums3[z/2]+nums3[(z/2)-1])/2.0;
        }
        else{
            x=nums3[z/2];
        }
        return x;
    }
}