class Solution {
    public int maxArea(int[] heights) {
        int start=0;
        int end=heights.length-1;
        int maxamt =0;
        while(start<end){
            int curamt = (end-start)*(Math.min(heights[start],heights[end]));
            if(curamt>maxamt){
                maxamt=curamt;
            }
            if(heights[start]<=heights[end]){
                start++;
            }
            else if(heights[start]>heights[end]){
                end--;
            }
        }
        return maxamt;
    }
}
