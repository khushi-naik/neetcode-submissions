class Solution {
    public boolean isValid(String s) {
        if(s.charAt(0)== ']' || s.charAt(0)== '}'|| s.charAt(0)== ')' || s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '[' || ch == '{'|| ch == '('){
                st.push(ch);
            } 
            else{
                if(!st.empty()){
                    char p = st.peek();
                if(ch == ']' && p != '['){
                    return false;
                }
                else if(ch == '}' && p != '{'){
                    return false;
                }
                else if(ch == ')' && p != '('){
                    return false;
                }
                else{
                    st.pop();
                }
                }
                else{
                    return false;
                }
                
            }
        }
        return st.size()==0;
    }
}
