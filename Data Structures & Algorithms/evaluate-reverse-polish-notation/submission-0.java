class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s = new Stack<>();
        String o = "+-*/";
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].length()==1 && o.contains(tokens[i])){
                int op2 = s.pop();
                int op1 = s.pop();
                if(tokens[i].contains("+")){
                    int res = op1+op2;
                    s.push(res);
                }
                else if(tokens[i].contains("-")){
                    int res = op1-op2;
                    s.push(res);
                }
                else if(tokens[i].contains("*")){
                    int res = op1*op2;
                    s.push(res);
                }
                if(tokens[i].contains("/")){
                    int res = op1/op2;
                    s.push(res);
                }
            }
            else{
                s.push(Integer.parseInt(tokens[i]));
            }
        }
        return s.pop();
    }
}
