class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int k=0;k<nums.length-2;k++){
            if(k>0 && nums[k]==nums[k-1]){
                continue;
            }
            int i=k+1;
            int j=nums.length-1;
            while(i<j){
                //System.out.println(k);
                if(nums[i]+nums[j]> -nums[k]){
                    j--;
                }
                else if(nums[i]+nums[j]< -nums[k]){
                    i++;
                }
                else if(nums[i]+nums[j]== -nums[k]){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    i++;
                    while(i<j && nums[i]==nums[i-1]){
                        i++;
                    }
                }
            }
        }
        return result;
    }
}
