class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>high){
                high=piles[i];
            }
        }

        int mid =0;
        int res=high;
        while(low<=high){
            mid =(low+high)/2;
            int currhours=0;
            for(int i=0;i<piles.length;i++){
                currhours+=Math.ceil((double)piles[i]/mid);
            }
            if(currhours>h){
                low=mid+1;
            }
            else{
                res = mid;
                high=mid-1;
            }
            
        }

        return res;
    }
}
