class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0, totalMax=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)  
                max++;
            else if(nums[i]==0){
                if(max>totalMax)
                    totalMax =max;
                max=0;
            }
        }
        if(max>totalMax)
        totalMax =max;
        return totalMax;
    }
}