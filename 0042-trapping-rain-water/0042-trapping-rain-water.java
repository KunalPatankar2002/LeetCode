class Solution {
    public int trap(int[] height) {
        int count=0;
        for(int i=1;i<height.length-1;i++){
            int left=0,right=0;
            int j=i;
            while (j >= 0) {
                left = Math.max(left, height[j]);
                j--;
            }
            j = i;
            while (j < height.length) {
                right = Math.max(right, height[j]);
                j++;
            }
            count += Math.min(right,left) - height[i];
        }
        return count;
    }
}