class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1,mid=0;
        if(r==0 || nums[l]!=nums[l+1])
            return nums[l];
        if(nums[r]!=nums[r-1])
            return nums[r];
        while(l<=r){
            mid = l+(r-l)/2;
            if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
                return nums[mid];
            else if(mid%2==0 && nums[mid+1] == nums[mid] || mid%2==1 && nums[mid-1] == nums[mid]){
                l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return -1;
    }
}