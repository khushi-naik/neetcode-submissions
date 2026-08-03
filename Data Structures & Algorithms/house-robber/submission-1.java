class Solution {
    public int help(int[] nums, int i, int[] cache){
        if(i>=nums.length){
            return 0;
        }
        if(cache[i]!=0){
            return cache[i];
        }

        cache[i] = Math.max(nums[i]+help(nums,i+2,cache),help(nums,i+1,cache));
        return cache[i];
    }
    public int rob(int[] nums) {
        int[] cache = new int[nums.length];
        return help(nums,0,cache);
    }
}
