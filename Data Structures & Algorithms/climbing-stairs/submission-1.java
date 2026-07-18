class Solution {
    public int res=0;
    public void climb(int n){
        if(n<0){
            return;
        }
        if(n==0){
            res++;
        }
        climb(n-1);
        climb(n-2);
        return;
    }

    
    public int helper(int n){
        if(n<0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(cache[n]!=0){
            return cache[n];
        }
        cache[n] = helper(n-1)+helper(n-2);
        return cache[n];
    }
    int[] cache;
    public int climbStairs(int n) {
        cache = new int[n+1];
        return helper(n);
        
        // if(n<0){
        //     return 0;
        // }
        // if(n==0){
        //     return 1;
        // }

        // return climbStairs(n-1)+climbStairs(n-2);
        //recursive soln
        //climb(n);
        //return res;

        //bottom-up soln
        // if(n<=2){
        //     return n;
        // }
        // int[] ar = new int[n+1]; //memoization
        // ar[1] = 1; //base condition
        // ar[2] = 2;

        // for(int i=3;i<=n;i++){
        //     ar[i] = ar[i-1]+ar[i-2]; //recursion 
        
        // }
        // return ar[n];


    }
}
