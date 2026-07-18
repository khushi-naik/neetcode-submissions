class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        List<int[]> l = new ArrayList<>();
        int i=0;
       
        
            
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            res.add(intervals[i]);
            i++;
        }
        
        res.add(newInterval);
        while(i<intervals.length && res.get(res.size()-1)[1] >= intervals[i][0]){
                res.get(res.size()-1)[0] = Math.min(res.get(res.size()-1)[0], intervals[i][0]);
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1], intervals[i][1]);
                i++;
            
        }
        while(i<intervals.length){
            res.add(intervals[i]);
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
