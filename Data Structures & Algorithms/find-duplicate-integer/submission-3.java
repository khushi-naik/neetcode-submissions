class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[Math.abs(nums[i])-1] <0){
                return Math.abs(nums[i]);
            }
            nums[Math.abs(nums[i])-1] *= -1;
            
        }
        return 1;
        /*HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return nums[i];
            }
            else{
                hs.add(nums[i]);
            }
        }

        return 1;*/
    }
}
