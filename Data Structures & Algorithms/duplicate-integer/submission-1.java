class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            else{
                set.add(nums[i]);
            }

        }
        return false;
        // for(int i=0;i<nums.length;i++){
        //     if(set.isEmpty() || !set.contains(nums[i])){
        //         set.add(nums[i]);
        //     }
        //     else{
        //         return true;
        //     }

        // }
        // return false;
    }
}