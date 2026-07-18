class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        Map<Character,Integer> m = new HashMap<>();
        Map<Character,Integer> m2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), m.get(s.charAt(i)+1));
                continue;
            }
            m.put(s.charAt(i),1);

        }
        for(int i=0;i<t.length();i++){
            if(m2.containsKey(t.charAt(i))){
                m2.put(t.charAt(i), m2.get(t.charAt(i)+1));
                continue;
            }
            m2.put(t.charAt(i),1);
        }
        return m.equals(m2);
    }
}
