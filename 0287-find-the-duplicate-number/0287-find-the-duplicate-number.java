class Solution {
    public int findDuplicate(int[] nums) {
        int p1=0,p2=0;
        while(true){
            p1 = nums[nums[p1]];
            p2 = nums[p2];
            if(p1==p2)
                break;
        }
        p1=0;
        while(true){
            p1 = nums[p1];
            p2 = nums[p2];
            if(p1==p2)
                break;
        }
        return p1;
    }
}