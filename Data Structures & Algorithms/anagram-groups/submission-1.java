class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            int[] ch = new int[26];
            for(int j=0;j<strs[i].length();j++){
                ch[strs[i].charAt(j)-'a']++;
            }

            String hmKey = Arrays.toString(ch);
            if(hm.containsKey(hmKey)){
                hm.get(hmKey).add(strs[i]);
            }
            else{
                List<String> ls = new ArrayList<>();
                ls.add(strs[i]);
                hm.put(hmKey, ls);
            }
        }
        List<List<String>> res = new ArrayList<>();
        for(List<String> item : hm.values()){
            res.add(item);
        }
        return res;
        // for(int i=0;i<strs.length;i++){
        //     char[] cArray = strs[i].toCharArray();
        //     Arrays.sort(cArray);
        //     String str = new String(cArray);

        //     if(hm.containsKey(str)){
        //         hm.get(str).add(strs[i]);
        //     }
        //     else{
        //         List<String> l = new ArrayList<>();
        //         l.add(strs[i]);
        //         hm.put(str, l);
        //     }
        // }

        // List<List<String>> res = new ArrayList<>();
        // for(List<String> item : hm.values()){
        //     res.add(item);
        // }
        // return res;
    }
}
