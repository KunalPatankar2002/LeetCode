class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, count2 = 0;
        int[] num = new int[2];
        for(int i=0; i<nums.length; i++){
            if(count1==0 && num[1]!=nums[i])    
                num[0]=nums[i];
            else if(count2==0 && num[0]!=nums[i])    
                num[1]=nums[i];
            if(nums[i] == num[0])
                count1++;
            else if(nums[i] == num[1])
                count2++;
            else{
                count1--;
                count2--;
            }
        }
        List<Integer> l = new ArrayList<Integer>();
        count1 = 0; count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num[0]) count1++;
            if (nums[i] == num[1]) count2++;
        }
        if(count1>nums.length/3)
            l.add(num[0]);
        if(count2>nums.length/3 && num[1]!=num[0])
            l.add(num[1]);
        return l;
    }
}