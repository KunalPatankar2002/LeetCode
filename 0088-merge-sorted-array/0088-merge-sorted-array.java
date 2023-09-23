class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        --n;
        --m;
        if(m<0){
            for(int i=0; i<nums1.length;i++)
                nums1[i]=nums2[i];
            return;
        }
        for(int i=nums1.length-1;i>-1;){
            if(n<0 || m<0){
                break;
            }
            if(nums1[m] == nums2[n]){
                nums1[i--] = nums1[m--];
                nums1[i--] = nums2[n--];
            }
            else if(nums1[m] > nums2[n]){
                nums1[i--] = nums1[m--];
            }
            else {
                nums1[i--] = nums2[n--];
            }
        }
        if(!(n<0)){
            for(int i=0; i<=n;i++)
                nums1[i]=nums2[i];
        }
    }
}