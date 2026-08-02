class Solution {
     
    public int helper(int n, int[] ar){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        
       
        if(ar[n]!=0){
            return ar[n];
        }
        ar[n] = helper(n-1,ar)+helper(n-2,ar);
        return ar[n];
    }
    public int climbStairs(int n) {
        int[] ar = new int[n+1];
        return helper(n, ar);
    }
}
