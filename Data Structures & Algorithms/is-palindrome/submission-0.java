class Solution {
    public boolean isPalindrome(String s) {
        String res ="";
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                res=res+s.charAt(i);
            }
        }
        res=res.toLowerCase();
        int left=0;
        int right=res.length()-1;
        while(left<right){
            if(res.charAt(left)!=res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
