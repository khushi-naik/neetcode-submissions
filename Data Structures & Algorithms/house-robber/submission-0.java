class Solution {
    public int res=0;
    public int helper(int[] num, int i, int[] mem){
        if(i>=num.length){
            return 0;
        }
        if(mem[i]!=0){
            return mem[i];
        }
        int robcur = num[i] + helper(num,i+2,mem);
        int robnot = helper(num, i+1, mem);
        mem[i] = Math.max(robnot,robcur);
        return mem[i];
    }

    public int help(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(cache[i]!=0){
            return cache[i];
        }
        cache[i] = Math.max(nums[i]+help(nums,i+2), help(nums,i+1));
        return cache[i];
    }

    int[] cache;
    public int rob(int[] nums) {
        cache = new int[nums.length];
        return help(nums, 0);
        // int[] mem = new int[nums.length];
        // helper(nums, 0, mem);
        // return mem[0];
    }
}
