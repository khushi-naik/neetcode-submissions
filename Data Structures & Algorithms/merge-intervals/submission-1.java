class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(intervals[0]);
        int i=1;
        while(i<intervals.length){
            if(res.get(res.size()-1)[1]>=intervals[i][0]){
                res.get(res.size()-1)[1] = Math.max(res.get(res.size()-1)[1],intervals[i][1]);
            }
            else{
                res.add(intervals[i]);
            }
            i++;
        }

        return res.toArray(new int[res.size()][]);
    }
}
