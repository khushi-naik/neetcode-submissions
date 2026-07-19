class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int curr=0;
        HashSet<Character> hs = new HashSet<>();
        int l=0;
        int r=0;

        while(r<s.length()){
            if(!hs.contains(s.charAt(r))){
                curr = r-l+1;
                if(curr>max){
                    max = curr;
                }
                hs.add(s.charAt(r));
                r++;
            }
            else{
                while(hs.contains(s.charAt(r))){
                    hs.remove(s.charAt(l));
                    l++;
                }
                hs.add(s.charAt(r));
                r++;
            }
        }

        return max;
        
    }
}
