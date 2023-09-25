class Solution {
    public int missingNumber(int[] nums) {
        int sum=0, sumn=0;
        for(int i=0; i<nums.length; i++){
            sumn+=i+1;
            sum+=nums[i];
        }
        return sumn-sum;
    }
}