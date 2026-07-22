class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            if(curr == '(' || curr == '{' || curr=='['){
                st.add(curr);
            }
            else{
                if((!st.empty()) && ((curr == ')' && st.peek()=='(') || 
                (curr == '}' && st.peek()=='{') ||
                (curr == ']' && st.peek()=='['))){
                    st.pop();
                }
                else{
                    st.add(curr);
                }
            }
        }

        return st.empty();

        // Stack<Character> st = new Stack<>();
        // //st.add(s.charAt(0));
        // for(int i=0;i<s.length();i++){
        //     char cur = s.charAt(i);
        //     // if(cur=='(' || cur=='{' || cur=='['){
        //     //     st.add(cur);
        //     // }
        //     if(!st.isEmpty() && ((st.peek()=='(' && cur==')') ||
        //     (st.peek()=='{' && cur=='}') ||
        //     (st.peek()=='[' && cur==']'))){
        //         st.pop();
        //     }
        //     else{
        //         st.add(cur);
        //     }
        // }

        // return st.isEmpty();
    }
}
