class Solution {
    int[] cache;
    public int helper(int[] cost, int i){
        if(i>= cost.length){
            return 0;
        }
        if(cache[i]!=-1){
            return cache[i];
        }
        cache[i] = cost[i]+Math.min(helper(cost, i+1), helper(cost, i+2));
        return cache[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        cache = new int[cost.length];
        for(int i=0;i<cache.length;i++){
            cache[i] = -1;
        }
        return Math.min(helper(cost,0), helper(cost,1));
    }
}
