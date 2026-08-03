class Solution {
    public int help(int[] coins, int amt, int[] cache){
        if(amt==0){
            return 0;
        }
        if(cache[amt]!=-1){
            return cache[amt];
        }

        int res=Integer.MAX_VALUE;
        for(int i=0;i< coins.length;i++){
            if(coins[i]<=amt){
                int select = help(coins,amt-coins[i],cache);
                if(select!=Integer.MAX_VALUE){
                    res = Math.min(res,1+select);
                }
                
            }
        }

        cache[amt] = res;
        return cache[amt];
    }

    public int coinChange(int[] coins, int amount) {
        int[] cache = new int[amount+1];
        for(int i=0;i<cache.length;i++){
            cache[i] = -1;
        }
        int res = help(coins, amount, cache);
        if(res == Integer.MAX_VALUE){
            return -1;
        }
        return res;
    }
}
