class Solution {
    public void nextPermutation(int[] nums) {
        int weight=0, len=nums.length,min=0,minLoc=0;
        for(int i=len-2;i>-1;i--){
            if(nums[i]<nums[i+1]){
                minLoc=i+1;
                for(int j=i+1; j<len; j++){
                    if(nums[j] > nums[i] && nums[j] < nums[minLoc]){
                        minLoc=j;
                        System.out.println(minLoc);
                    }
                }
                int temp = nums[i];
                nums[i] = nums[minLoc];
                nums[minLoc] = temp;
                Arrays.sort(nums,i+1,len);
                break;
            }
            else if(i==0){
                Arrays.sort(nums);
                break;
            }
        }
    }
}