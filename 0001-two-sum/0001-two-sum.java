// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int i =0,j=0;
//         lp: for(i=0;i<nums.length;i++){
//             for(j=i+1;j<nums.length;j++){
//                 if(nums[i]+nums[j]==target){
//                     break lp;
//                 }
//             }
//         }
//         int[] ans = {i,j};
//         return ans;
//     }
// }
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}