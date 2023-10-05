class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int count=1, max=1;
        if(nums.length==0){
            return 0;
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]-nums[i-1] == 1){
                count++;
            }
            else if(nums[i]-nums[i-1] != 0){
                if(max<count)
                    max=count;
                count=1;
                
            }
        }
        if(max<count)
            max=count;
        return max;
    }
}