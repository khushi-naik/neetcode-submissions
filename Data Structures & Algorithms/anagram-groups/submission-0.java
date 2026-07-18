class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] cArray = strs[i].toCharArray();
            Arrays.sort(cArray);
            String str = new String(cArray);

            if(hm.containsKey(str)){
                hm.get(str).add(strs[i]);
            }
            else{
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                hm.put(str, l);
            }
        }

        List<List<String>> res = new ArrayList<>();
        for(List<String> item : hm.values()){
            res.add(item);
        }
        return res;
    }
}
