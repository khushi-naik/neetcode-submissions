class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i])+1);
            }
            else{
                hm.put(nums[i],1);
            }
        }
        //System.out.println("map "+hm);
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0;i<bucket.length;i++){
            bucket[i] = new ArrayList<>();
        }
        for(int key: hm.keySet()){
            //System.out.println("key"+key);
            bucket[hm.get(key)].add(key);
            //System.out.println("buck"+bucket[hm.get(key)]);
            
        }
        // for(int i=0;i<bucket.length;i++){
        //     System.out.println(bucket[i]);
        // }

        int[] res = new int[k];
        int i=bucket.length-1;
        int j=0;
        while(k>0){
            if(!bucket[i].isEmpty()){
                for(int l=0;l<bucket[i].size() && k>0;l++){
                    //System.out.println(bucket[i].get(l));
                    res[j]=bucket[i].get(l);
                    k--;
                    j++;
                }
                i--;
            }
            else{
                i--;
                continue;
            }
        }
        return res;
    }
}
