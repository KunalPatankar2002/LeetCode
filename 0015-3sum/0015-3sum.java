class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> h = new HashSet<>();
        for(int i=0; i<nums.length;i++){
            HashSet<Integer> h1 = new HashSet<Integer>();
            for(int j =i+1; j<nums.length;j++){
                int k = -nums[i]-nums[j];
                if(h1.contains(k)){
                    List<Integer> l = Arrays.asList(nums[i],nums[j],k);
                    l.sort(null);
                    h.add(l);
                }
                h1.add(nums[j]);
            }
        }
        List<List<Integer>> ans = new ArrayList<>(h);
        return ans;
    }
}