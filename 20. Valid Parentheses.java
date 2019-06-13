class Solution {
    public boolean isValid(String s) {
    Stack<Character> st = new Stack<Character>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{'||s.charAt(i) == '['){
                st.push(s.charAt(i));
            }else if(s.charAt(i) == ')'){
                if(st.empty()||st.peek() != '('){
                    return false;
                }else{
                    st.pop();
                }
            }else if(s.charAt(i) == '}') {
                if(st.empty()||st.peek() != '{'){
                    return false;
                }else{
                    st.pop();
                }
            }else if(s.charAt(i) == ']'){
                if(st.empty()||st.peek() != '['){
                    return false;
                }else{
                    st.pop();
                } 
            } 
        }
        if(st.empty()){
            return true;
        }else{
            return false;
        }
    }
}
