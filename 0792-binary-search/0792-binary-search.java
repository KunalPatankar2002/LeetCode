class Solution {
    public int search(int[] nums, int target) {
        return bins(nums, target,0, nums.length-1);
        
    }
    int bins(int[] nums, int target, int l, int r){
        if(r >= l){
            int mid = (l + r)/2;
            System.out.println(mid);
            if(nums[mid] == target)
                return mid;
            if( nums[mid] > target)
                return bins(nums, target, l, mid-1);
            if( nums[mid] < target)
                return bins(nums, target, mid+1, r);
        }
        return -1;
    }
}