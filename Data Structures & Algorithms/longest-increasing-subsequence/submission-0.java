class Solution {
    public int help(int[] nums, int i, int[] cache){
        if(i>=nums.length){
            return 0;
        }
        if(cache[i]!=0){
            return cache[i];
        }
        int res= 1;
        for(int j=i+1;j<nums.length;j++){
            if(nums[j]>nums[i]){
                res=Math.max(res, 1+help(nums,j,cache));
            }
        }
        cache[i] = res;
        return cache[i];
    }
    public int lengthOfLIS(int[] nums) {
        int[] cache = new int[nums.length];
        int res=0;
        for(int i=0; i<nums.length;i++){
            res = Math.max(res,help(nums,i,cache));
        }
        return res;
    }
}
